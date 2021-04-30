package com.desertbeetle.githubjob.client;

import com.desertbeetle.githubjob.Constants;
import com.desertbeetle.githubjob.svc.SvcException;

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
        try {
            githubjob.run();
        } catch (SvcException svc) {
            System.out.println("Ops.. ");
            System.out.println(svc.getMessage());
        }
    }

}
