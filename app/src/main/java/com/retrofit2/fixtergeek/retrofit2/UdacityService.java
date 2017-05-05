package com.retrofit2.fixtergeek.retrofit2;

import com.retrofit2.fixtergeek.retrofit2.models.UdacityCatalog;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by fixtergeek on 05/05/17.
 */

public interface UdacityService {

    public static final  String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();

}
