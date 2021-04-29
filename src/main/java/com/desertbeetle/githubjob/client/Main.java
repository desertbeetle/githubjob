package com.desertbeetle.githubjob.client;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Desert Beetle! Welcome to Coding Challenge~!");

        String[] cities = new String[] {"Boston", "San Francisco", "Log Angeles", "Denver", "Boulder", "Chicago", "New York" ,"Raleigh"};
        String[] langs = {"Java", "C#", "Python", "Swift", "Objective-C", "Ruby", "Kotlin", "Go", "C++", "Javascript"};

        GitHubJob githubjob = new GitHubJob(cities, langs);
        githubjob.run();


    }

}
