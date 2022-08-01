package ru.spb.springlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final LoginServiceImpl loginService;

    public LoginController(LoginServiceImpl loginService) {
        this.loginService = loginService;
    }

    @GetMapping(path = "/login")
    public String loginCtrl(@RequestParam("login") String user,
                            @RequestParam("password") String pass,
                            @RequestParam("passConfirmation") String passwordConfirmation) {
        try {
            return loginService.login(user, pass, passwordConfirmation);
        } catch (WrongLoginException e) {
            return "Не верный логин, попробуйте другой";
        } catch (WrongPasswordException e) {
            return "Не верный пароль, попробуйте другой";
        }

    }
}
