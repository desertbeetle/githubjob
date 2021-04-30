package com.desertbeetle.githubjob.svc;

/**
 * The exception indicates something goes wrong.
 */
public class SvcException extends Exception{

    public SvcException(String message) {
        super(message);
    }

    public SvcException(Throwable cause) {
        super(cause);
    }
}
