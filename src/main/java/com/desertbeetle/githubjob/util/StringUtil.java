package com.desertbeetle.githubjob.util;

/**
 * String related utility methods
 */
public class StringUtil {

    /**
     * Returns true if s1 contains s2
     * @param s1
     * @param s2
     * @param caseSensitive compare with insensitive or not
     * @return
     */
    public static boolean contains(String s1, String s2, boolean caseSensitive) {
        if (caseSensitive) {
            return s1.contains(s2);
        }
        return s1.toLowerCase().contains(s2.toLowerCase());
    }

    /**
     * Default is case insensitive
     * @param s1
     * @param s2
     * @return
     */
    public static boolean contains(String s1, String s2) {
        return contains(s1, s2, false);
    }
}
