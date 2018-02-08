package com.example.satsah.daggerexample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by satsah on 2/6/2018.
 */


/* This module will provide the Context */
@Module
public class AppModule {
    private Application mApplication;

    AppModule (Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication () {
        return mApplication;
    }
}
