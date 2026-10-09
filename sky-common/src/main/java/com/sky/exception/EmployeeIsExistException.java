package com.sky.exception;

public class EmployeeIsExistException extends BaseException {

    public EmployeeIsExistException(){

    }

    public EmployeeIsExistException(String message) {
        super(message);
    }
}
