package com.springboot.demo.rest.student.exception;


public class DuplicateStudentFoundException extends RuntimeException {
    public DuplicateStudentFoundException(String message)
    {
        super(message);
    }
}
