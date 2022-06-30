package com.homework.work03_自定义异常.题目一;

public class SexException extends RuntimeException{
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }
}
