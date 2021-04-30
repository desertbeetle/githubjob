package com.desertbeetle.githubjob;

import com.desertbeetle.githubjob.svc.RestClient;
import com.desertbeetle.githubjob.svc.SvcException;
import org.junit.Test;
import org.mockito.Mockito;

public class RestClientTest {

    final String EMPTY_JOBS="[]";

    @Test
    public void test() throws SvcException {
        RestClient client = new RestClient();
        RestClient spy = Mockito.spy(client);
        // to be supplied
    }
}
