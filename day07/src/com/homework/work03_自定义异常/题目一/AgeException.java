package com.homework.work03_自定义异常.题目一;

public class AgeException extends RuntimeException{
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
