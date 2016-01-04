package com.huntdreams.bookstore.controller;

/**
 * Created by noprom on 1/4/16.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 登陆控制器
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    public static final String ACCOUNT_ATTRIBUTE = "account";


    /**
     * 登陆页面
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
