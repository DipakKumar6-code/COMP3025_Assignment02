package com.example.cineplex_movies2025.MovieNetworks;

import com.example.cineplex_movies2025.Models.Movie;
import com.example.cineplex_movies2025.Models.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    @GET("/")
    Call<MovieResponse> searchMovies(@Query("s") String title, @Query("apikey") String apiKey);

    // Fetch movie details by IMDB ID
    @GET("/")
    Call<Movie> getMovieDetails(@Query("i") String imdbID, @Query("apikey") String apiKey);
}
