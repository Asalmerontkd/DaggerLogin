package com.Antonio.daggerlogin;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application app;

    public AppModule(Application application){
        this.app = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return app;
    }
}
