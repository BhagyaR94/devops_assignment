package com.devops.nfis.exception;

public class TokenRefreshException extends Throwable {
    private String token;
    private String exception;

    public TokenRefreshException(String token, String exception) {
        this.token = token;
        this.exception = exception;
    }
}
