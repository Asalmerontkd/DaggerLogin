package com.Antonio.daggerlogin.login;

public class LoginActivityModel implements LoginActivityMVP.Model {
    private LoginRepository repository;

    public LoginActivityModel( LoginRepository repository ){
        this.repository = repository;
    }

    @Override
    public void crearUser(String firstName, String lastName) {
        // logica de negocio
        repository.saveUser(new User(firstName, lastName));
    }

    @Override
    public User getUser() {
        // logica de negocio
        return repository.getUser();
    }
}
