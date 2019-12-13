package com.login.domo.service.impl;

import com.login.domo.domain.User;
import com.login.domo.repository.UserRepo;
import com.login.domo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;



    public User getUser(int id, String password) {
        User byIdAndPassword = userRepo.findByIdAndPassword(id, password);
        if (Objects.isNull(byIdAndPassword)) {
            throw new NoSuchElementException(String.format("*** Invalid User Credential *** "));
        }
        return byIdAndPassword;
    }

    @Override
    public User saveUserDetails(String user, String userName, String password) {
        return userRepo.saveAndFlush(new User(user, userName, password));
    }
}
