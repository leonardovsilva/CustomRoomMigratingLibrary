package com.leonardovsilva.roommigrationlib;

public class ExceptionRoomApi extends Exception {

    private final ErrorCode code;

    public ExceptionRoomApi(String message, Throwable cause, ErrorCode code) {
        super(message, cause);
        this.code = code;
    }

    public ExceptionRoomApi(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public ErrorCode getCode() {
        return this.code;
    }


}
