package com.login.domo.service;

import com.login.domo.domain.User;

public interface UserService {

    User getUser(int username, String password);

    User saveUserDetails(String user, String userName, String password);

}
