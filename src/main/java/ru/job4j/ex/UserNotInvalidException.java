package ru.job4j.ex;

public class UserNotInvalidException extends UserNotFoundException {
    public UserNotInvalidException(String message) {
        super(message);
    }
}
