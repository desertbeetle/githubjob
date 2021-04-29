package com.desertbeetle.githubjob;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class GitHubJobSvcTest {
    @Mock
    private GitHubJobSvc gitHubJobSvc = new GitHubJobSvcImpl();

    @Test
    public void test() {
        Job[] allJobs = getAllJobs();
        when(gitHubJobSvc.getAllJobs()).thenReturn(allJobs);
        assertEquals(3, gitHubJobSvc.getAllJobs());
    }

    private Job[] getAllJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("1"));
        jobs.add(new Job("2"));
        jobs.add(new Job("3"));
        //Convert to string array
        Job[] array = jobs.toArray(new Job[jobs.size()]);
        return array;
    }
}
