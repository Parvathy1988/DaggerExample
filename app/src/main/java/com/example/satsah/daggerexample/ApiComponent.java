package com.example.satsah.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by satsah on 2/6/2018.
 */
@Singleton
@Component(modules = {AppModule.class,ApiModule.class})
public interface ApiComponent {
    void inject (MainActivity activity);
}
