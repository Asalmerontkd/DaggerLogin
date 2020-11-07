package com.Antonio.daggerlogin.root;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App app;

    public AppModule(App application){
        this.app = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return app;
    }
}
