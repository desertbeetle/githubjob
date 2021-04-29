package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.client.GitHubJob;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubJobTest {
    @Test
    public void outputTest() {
        String[] loc = new String[] {"Loc1", "Loc2", "Loc3"};
        String[] lang = {"Lang1", "Lang2", "Lang3"};

        GitHubJob gitHubJob = new GitHubJob(loc, lang);
        String exp = "Loc1:\n" +
                "- Lang1: 0.0%\n" +
                "- Lang2: 0.0%\n" +
                "- Lang3: 0.0%\n" +
                "Loc2:\n" +
                "- Lang1: 0.0%\n" +
                "- Lang2: 0.0%\n" +
                "- Lang3: 0.0%\n" +
                "Loc3:\n" +
                "- Lang1: 0.0%\n" +
                "- Lang2: 0.0%\n" +
                "- Lang3: 0.0%\n";

        String actual = gitHubJob.getResult();
        assertEquals(exp, actual);
    }
}
