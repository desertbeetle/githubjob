package com.desertbeetle.githubjob;

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
        for (String loc : locations) {
            System.out.println(loc+":");
            for (String lang : languages) {
                double perc = jobController.getJobCont(loc, lang);
                    System.out.println("- " + lang + ": " + perc + "%");
            }
        }
    }
}
