package com.Antonio.daggerlogin.root;

import com.Antonio.daggerlogin.login.LoginActivity;
import com.Antonio.daggerlogin.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(LoginActivity tarjet);

}
