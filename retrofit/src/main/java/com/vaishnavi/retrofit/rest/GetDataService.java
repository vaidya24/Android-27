package com.vaishnavi.retrofit.rest;

import com.vaishnavi.retrofit.domain.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/api/v1/employeess")
    Call<Response> getAllEmployee();
}

