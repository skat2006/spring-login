package ru.spb.springlogin;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        System.out.println("Не верный пароль");
    }
}
