package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.util.TextUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TextUtilTest {

    @Test
    public void doubleToTwoDecimalRoundUpTest() {
        double d = 33.335;
        String act = TextUtil.twoDecimal(d);
        String exp = "33.34";
        assertEquals(exp, act);
    }

    @Test
    public void doubleToTwoDecimalNoRoundUpTest() {
        double d = 33.33;
        String act = TextUtil.twoDecimal(d);
        String exp = "33.33";
        assertEquals(exp, act);
    }
}
