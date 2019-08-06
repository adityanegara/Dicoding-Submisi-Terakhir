package com.example.dicoding_submisi2.alarm;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ReleaseTodayMovieInterface {


    @GET("/3/discover/{category}")
    Call<ReleaseTodayMovie> listOfTodayMovie(

            @Path("category") String category,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("sort_by") String sort_by,
            @Query("include_adult") String include_adult,
            @Query("include_video") String include_video,
            @Query("page") int page,
            @Query("primary_release_date.gte") String primary_release_date_gte,
            @Query("primary_release_date.lte") String primary_release_date_ite
//https://api.themoviedb.org/3/discover/movie?api_key=b9239506432ea4c54f8b16f4a3679008&language=en-US&sort_by=release_date.asc&include_adult=false&include_video=false&page=1&primary_release_date.gte=2019-04-24&primary_release_date.lte=2019-04-24

    );
}
