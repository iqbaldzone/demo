package com.login.domo.controller;

import com.login.domo.domain.User;
import com.login.domo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login(@RequestParam("id") int id, @RequestParam("password") String password) {
        return userService.getUser(id, password);
    }

    @PostMapping("/save")
    public User saveDetails(@RequestParam("user") String user, @RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.saveUserDetails(user, username, password);
    }
}
