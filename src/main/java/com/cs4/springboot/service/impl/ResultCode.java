package com.cs4.springboot.service.impl;

import com.cs4.springboot.service.IErrorCode;

public enum ResultCode implements IErrorCode {
        SUCCESS(200, "Operation success"),
        FAILED(500, "Operation failed"),
        VALIDATE_FAILED(404, "Parameter checksum failed"),
        UNAUTHORIZED(401, "Not logged in or token has expired"),
        FORBIDDEN(403, "No access");
        private long code;
        private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}