package ru.spb.springlogin;

public interface LoginService {

    String login(String user, String password, String pasConfirmation);
}
