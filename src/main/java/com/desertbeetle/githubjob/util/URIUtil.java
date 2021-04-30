package com.desertbeetle.githubjob.util;


/**
 * URI related utility methods
 */
public class URIUtil {

    /**
     * Returns the query string with specific location to append to the URI
     *
     * @param loc   location
     * @return  Query string
     */
    public static String getQueryStringAtLocation(String loc) {
        return getQueryString(loc, null);
    }

    /**
     * Returns the query string with specific location and language to append to the URI
     *
     * Case 1: Both loc and lang are not null
     * https://jobs.github.com/positions?location=loc&description=lang
     * Case 2: lang is null
     * https://jobs.github.com/positions?location=loc
     * Case 3: loc contains space
     * https://jobs.github.com/positions?location=loc1%20loc2&description=lang
     *
     * @param loc   location
     * @param lang  language
     * @return  Query string
     */
    public static String getQueryString(String loc, String lang) {
        String retVal = "";
        if (loc!= null || lang!= null) {
            retVal += "?";
        }

        if (loc != null) {
            retVal += "location=";
            String newLoc = encodeLoc(loc);
            retVal += newLoc;
        }

        if (lang != null) {
            if (loc == null) {
                retVal += "description=";
            }
            else {
                retVal += "&description=";
            }
            retVal += encodeLang(lang);

        }
        return retVal;
    }

    /**
     * Encode space in UTF8
     *
     * @param s     input
     * @return
     */
    private static String encodeLoc(String s) {
        String[] splited = s.split(" ");
        if (splited.length == 1) {
            return s;
        }
        StringBuffer buf = new StringBuffer();
        for (String si: splited) {
            buf.append(si).append("%20");
        }
        String v = buf.toString();
        return v.substring(0, v.length() - 3);
    }

    /**
     * Encode plus(++) in UTF8
     * Encode sharp(#) in UTF8
     *
     * @param s
     * @return
     */
    private static  String encodeLang(String s) {
        if (s.contains("++")) {
            return s.replace("++", "%2B%2B");
        }

        if (s.contains("#")) {
            return s.replace("#", "%23");
        }
        return s;
    }

}
