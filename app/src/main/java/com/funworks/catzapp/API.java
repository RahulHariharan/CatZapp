package com.funworks.catzapp;

import retrofit2.Retrofit;

/**
 * Created by rahulhariharan on 06/06/18.
 */

@Module
public class API {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl()
            .addConverterFactory()
            .build();


}
