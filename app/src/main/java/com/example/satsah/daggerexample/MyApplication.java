package com.example.satsah.daggerexample;

import android.app.Application;

/**
 * Created by satsah on 2/6/2018.
 */

public class MyApplication  extends Application{
    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .build();
    }

    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}
