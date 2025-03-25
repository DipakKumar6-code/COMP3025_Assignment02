package com.example.cineplex_movies2025.Repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.cineplex_movies2025.Models.Movie;
import com.example.cineplex_movies2025.Models.MovieResponse;
import com.example.cineplex_movies2025.MovieNetworks.MovieApiService;
import com.example.cineplex_movies2025.MovieNetworks.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieRepository {

    private static final String userApiKey = "12542ee0";
    private final MovieApiService apiService;

    public MovieRepository() {
        apiService = RetrofitClient.getInstance().getApiService();
    }

    public LiveData<List<Movie>> searchMovies(String query) {
        MutableLiveData<List<Movie>> data = new MutableLiveData<>();

        apiService.searchMovies(query, userApiKey).enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    data.setValue(response.body().getMovies());
                } else {
                    data.setValue(null); // Handle empty or failed response
                }
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }

    public LiveData<Movie> getMovieDetails(String imdbID) {
        MutableLiveData<Movie> data = new MutableLiveData<>();

        apiService.getMovieDetails(imdbID, userApiKey).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                if (response.isSuccessful() && response.body() != null) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null); // Handle empty or failed response
                }
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}



