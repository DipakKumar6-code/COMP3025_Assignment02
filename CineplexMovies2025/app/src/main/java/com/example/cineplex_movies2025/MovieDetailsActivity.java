package com.example.cineplex_movies2025;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.cineplex_movies2025.Models.Movie;

public class MovieDetailsActivity extends AppCompatActivity {

    private ImageView moviePosterImage;
    private TextView movieTitleText, movieRating, movieYear, movieProduction, moviePlot;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        moviePosterImage = findViewById(R.id.moviePosterImage);
        movieTitleText = findViewById(R.id.movieTitleDetail);
        movieRating = findViewById(R.id.movieRating);
        movieYear = findViewById(R.id.movieReleasedYear);
        movieProduction = findViewById(R.id.movieStudio);
        moviePlot = findViewById(R.id.movieDescription);
        backButton = findViewById(R.id.backButton);

        // Get the movie object gained from the previous activity
        Movie movie = (Movie) getIntent().getSerializableExtra("movie");

        if (movie != null) {
            // Setting data to the views
            movieTitleText.setText(movie.getTitle());
            movieRating.setText("Imdb Rating: " + movie.getImdbRating());
            movieYear.setText("Released Year: " + movie.getYear());
            movieProduction.setText("Studio: " + movie.getProduction());
            moviePlot.setText("Description: " + movie.getPlot());

            // Load poster image using Glide
            Glide.with(this).load(movie.getPoster()).into(moviePosterImage);
        }

        // Set back button listener
        backButton.setOnClickListener(v -> finish());
    }
}



