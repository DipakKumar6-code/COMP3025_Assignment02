package com.example.cineplex_movies2025.Models;

import com.example.cineplex_movies2025.Models.Movie;

import java.util.List;

public class MovieResponse {
    private List<Movie> Search;

    public List<Movie> getMovies() {
        return Search;
    }

    public void setMovies(List<Movie> movies) {
        this.Search = movies;
    }
}
