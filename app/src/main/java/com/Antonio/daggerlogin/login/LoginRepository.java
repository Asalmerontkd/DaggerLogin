package com.Antonio.daggerlogin.login;

public interface LoginRepository {
    void saveUser(User user);

    User getUser();
}
