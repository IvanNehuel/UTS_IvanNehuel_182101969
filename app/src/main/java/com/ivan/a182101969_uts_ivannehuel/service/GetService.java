package com.ivan.a182101969_uts_ivannehuel.service;

import com.ivan.a182101969_uts_ivannehuel.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("users")
    Call<List<User>> getUsersList();
}
