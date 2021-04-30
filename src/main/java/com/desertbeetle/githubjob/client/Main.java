package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.Constants;

/**
 * The main class.
 *
 * Calculate the percentage of jobs of each language at each location.
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! Welcome to Coding Challenge!");
        GitHubJob githubjob = new GitHubJob(Constants.LOCATIONS, Constants.LANGUAGES);
        githubjob.run();

    }

}
