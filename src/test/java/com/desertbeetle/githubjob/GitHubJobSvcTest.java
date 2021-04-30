package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.model.Job;
import com.desertbeetle.githubjob.svc.GitHubJobSvc;
import com.desertbeetle.githubjob.svc.GitHubJobSvcImpl;
import com.desertbeetle.githubjob.svc.SvcException;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GitHubJobSvcTest {
    @Mock
    private GitHubJobSvc gitHubJobSvc = new GitHubJobSvcImpl();

    private GitHubJobSvc spy = Mockito.spy(gitHubJobSvc);

    @Test
    public void getAllJobsTest() throws SvcException {
        Job[] dummyJobs = getDummyJobs();
        Mockito.doReturn(dummyJobs).when(spy).getAllJobs();
        assertEquals(3, spy.getAllJobs().length);
    }

    private Job[] getDummyJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("1"));
        jobs.add(new Job("2"));
        jobs.add(new Job("3"));
        //Convert to string array
        Job[] array = jobs.toArray(new Job[jobs.size()]);
        return array;
    }
}
