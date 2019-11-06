package com.leonardovsilva.roommigrationlib;

public class ExceptionRoomApi extends Exception {

    private final ErrorStatus code;

    public ExceptionRoomApi(String message, Throwable cause, ErrorStatus code) {
        super(message, cause);
        this.code = code;
    }

    public ExceptionRoomApi(String message, ErrorStatus code) {
        super(message);
        this.code = code;
    }

    public ErrorStatus getCode() {
        return this.code;
    }


}
