package com.company;

public class InvalidAgeException extends Throwable {
    InvalidAgeException(String age){
        super(age);
    }
}
