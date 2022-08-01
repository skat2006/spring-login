package ru.spb.springlogin;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
        System.out.println("Логин не верный");
    }
}
