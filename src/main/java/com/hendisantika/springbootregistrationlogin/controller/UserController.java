package com.hendisantika.springbootregistrationlogin.controller;

import com.hendisantika.springbootregistrationlogin.service.SecurityService;
import com.hendisantika.springbootregistrationlogin.service.UserService;
import com.hendisantika.springbootregistrationlogin.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-registration-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/11/20
 * Time: 05.35
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;
}
