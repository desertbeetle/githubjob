package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.util.MathUtil;
import com.desertbeetle.githubjob.util.TextUtil;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathUtilTest {

    @Test
    public void hundredPercentTest() {
        double obtained = 1.0;
        double total = 1.0;
        double exp = 100.0;
        double act = MathUtil.calcPercent(obtained, total);
        assertEquals(exp, act);
    }

    @Test
    public void tenPercentTest() {
        double obtained = 10.0;
        double total = 100.0;
        double exp = 10.0;
        double act = MathUtil.calcPercent(obtained, total);
        assertEquals(exp, act);
    }

    @Test
    public void zeroPercentTest() {
        double obtained = 0.0;
        double total = 0.0;
        double exp = 0.0;
        double act = MathUtil.calcPercent(obtained, total);
        assertEquals(exp, act);
    }

    @Test
    public void thirtyThreePercentTest() {
        double obtained = 1.0;
        double total = 3.0;
        String exp = "33.33";
        String act = TextUtil.twoDecimal(MathUtil.calcPercent(obtained, total));
        assertEquals(exp, act);
    }
}
