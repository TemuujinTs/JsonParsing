package com.temka.jsonparsing;

import com.temka.jsonparsing.models.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyApi
{
    String BASE_URL = "https://jsonplaceholder.typicode.com/";


    @GET("posts")
    Call<List<Model>>getAllData();

    @GET("posts/{id}")
    Call<Model>getSpecificById(@Path("id")int userId);

}
