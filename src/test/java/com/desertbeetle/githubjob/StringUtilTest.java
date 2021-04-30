package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.util.MathUtil;
import com.desertbeetle.githubjob.util.StringUtil;
import com.desertbeetle.githubjob.util.TextUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringUtilTest {

    @Test
    public void sensitiveTest() {
        String s1 = "Javascript is required for this position.";
        String s2 = "JavaScript";
        assertFalse(StringUtil.contains(s1, s2, true));
        assertTrue(StringUtil.contains(s1, s2, false));

        // default is case insensitive
        assertTrue(StringUtil.contains(s1, s2));

    }

}
