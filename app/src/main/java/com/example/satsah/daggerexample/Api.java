package com.example.satsah.daggerexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by satsah on 2/6/2018.
 */

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
