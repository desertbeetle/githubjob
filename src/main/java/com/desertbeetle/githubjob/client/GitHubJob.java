package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.svc.GitHubJobSvcImpl;
import com.desertbeetle.githubjob.control.JobController;

public class GitHubJob {

    String[] locations;
    String[] languages;
    JobController jobController;

    public GitHubJob(String[] locations, String[] languages) {
        this.locations = locations;
        this.languages = languages;

        jobController = new JobController(new GitHubJobSvcImpl());
    }

    public void run() {
        String s = getResult();
        System.out.println(s);
    }

    /**
     *
     * @return
     */
    public String getResult() {
        // public scope for the ease of testing
        StringBuffer buffer = new StringBuffer();
        for (String loc : locations) {
            buffer.append(loc+":").append("\n");
            for (String lang : languages) {
                double percent = jobController.getPercentOfJob(loc, lang);
                buffer.append("- " + lang + ": " + percent + "%").append("\n");
            }
        }
        return buffer.toString();
    }
}
