package com.Antonio.daggerlogin;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity tarjet);

}
