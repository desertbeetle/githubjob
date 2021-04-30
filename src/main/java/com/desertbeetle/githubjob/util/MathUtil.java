package com.desertbeetle.githubjob.util;


/**
 * Math related utility methods.
 */
public class MathUtil {

    /**
     * Calculate percentage.
     *
     * The formula for calculating the percentage is (obtained * 100) / total.
     * This formula is wrong : obtained / total * 100
     *
     * @param obtained
     * @param total
     * @return Percentage
     */
    public static double calcPercent(double obtained, double total) {
        if (total == 0) {
            return 0;
        }

        //  wrong: obtained / total * 100

        return obtained * 100 / total;
    }
}
