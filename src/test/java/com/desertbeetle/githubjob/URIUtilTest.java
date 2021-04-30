package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.util.URIUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class URIUtilTest {

    //
    // URI util tests
    //

    @Test
    public void locAndLangTest() {
        String loc = "Boston";
        String lang = "Java";
        String exp = "?location="+loc+"&description="+lang;
        String act = URIUtil.getQueryString(loc, lang);
        assertEquals(exp, act);
    }

    @Test
    public void locationOnlyTest() {
        String loc = "Boston";
        String exp = "?location="+loc;
        String act = URIUtil.getQueryStringAtLocation(loc);
        assertEquals(exp, act);
    }

    @Test
    public void locWithSpaceTest() {
        String loc = "New York";
        String exp = "?location=New" + Constants.UTF8_SPACE + "York";
        String act = URIUtil.getQueryStringAtLocation(loc);
        assertEquals(exp, act);
    }

    @Test
    public void langWithPlusSignTest() {
        String loc = "Boston";
        String lang = "C++";
        String exp = "?location="+loc+"&description=C" + Constants.UTF8_PLUS + Constants.UTF8_PLUS;
        String act = URIUtil.getQueryString(loc, lang);
        assertEquals(exp, act);
    }

    @Test
    public void langCSharpTest() {
        String loc = "Boston";
        String lang = "C#";
        String exp = "?location="+loc+"&description=C" + Constants.UTF8_SHARP;
        String act = URIUtil.getQueryString(loc, lang);
        assertEquals(exp, act);
    }

}
