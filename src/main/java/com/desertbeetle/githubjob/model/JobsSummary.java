package com.desertbeetle.githubjob.model;

import com.desertbeetle.githubjob.util.TextUtil;

import java.util.ArrayList;

public class JobsSummary {

    ArrayList<Summary> summaries = new ArrayList<>();



    public void add(String loc, int jobCount, String keyword, int matchedCount, double percent) {
        Summary summary = new Summary(loc, jobCount, keyword, matchedCount, percent);
        summaries.add(summary);
    }

    public void add(String loc, int jobCount, String keyword, int matchedCount, String percent) {
        add(loc, jobCount, keyword, matchedCount, Double.parseDouble(percent));
    }


    private class Summary {
        String loc;
        int jCount;
        String keyword;
        int matchedCount;
        double percent;

        public Summary(String loc, int jCount, String keyword, int matchedCount, double percent) {
            this.loc = loc;
            this.jCount = jCount;
            this.keyword = keyword;
            this.matchedCount = matchedCount;
            this.percent = percent;
        }
    }

    public String getConsoleOutput() {
        String curr="";
        Summary summary;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i< summaries.size(); i++) {
            summary = summaries.get(i);
            if (!curr.equals(summary.loc)) {
                curr = summary.loc;
                // <Loc>:
                sb.append(curr).append("(").append(summary.jCount).append(")").append(":").append("\n");
            }
            // - <Lang>: <percent>%
            sb.append("- ").append(summary.keyword).append("(").append(summary.matchedCount).append(")").append(": ").append(TextUtil.twoDecimal(summary.percent)).append("%").append("\n");

        }
        return sb.toString();
    }
}
