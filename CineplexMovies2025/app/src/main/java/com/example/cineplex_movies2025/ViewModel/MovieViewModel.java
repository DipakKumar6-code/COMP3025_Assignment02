package com.example.cineplex_movies2025.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.cineplex_movies2025.Models.Movie;
import com.example.cineplex_movies2025.Repository.MovieRepository;

import java.util.List;

public class MovieViewModel extends ViewModel {

    private final MovieRepository movieRepository;

    public MovieViewModel() {
        movieRepository = new MovieRepository();
    }

    public LiveData<List<Movie>> searchMovies(String query) {
        return movieRepository.searchMovies(query);
    }

    public LiveData<Movie> getMovieDetails(String imdbID) {
        return movieRepository.getMovieDetails(imdbID);
    }
}

