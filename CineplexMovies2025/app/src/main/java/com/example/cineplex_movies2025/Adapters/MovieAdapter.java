package com.example.cineplex_movies2025.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.cineplex_movies2025.Models.Movie;
import com.example.cineplex_movies2025.R;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private Context context;
    private List<Movie> movies;
    private OnItemClickListener onRowItemsClickListener;

    public MovieAdapter(Context context, List<Movie> movies) {
        this.context = context;
        this.movies = movies;
    }

    public interface OnItemClickListener {
        void onItemClick(Movie movie);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onRowItemsClickListener = listener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);

        // Bind data to views
        holder.title.setText(movie.getTitle());
        holder.rating.setText(movie.getImdbRating());
        holder.year.setText(movie.getYear());
        holder.production.setText(movie.getProduction());

        // OnClick to open Movie Details Screen
        holder.itemView.setOnClickListener(v -> {
            if (onRowItemsClickListener != null) {
                onRowItemsClickListener.onItemClick(movie);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView title, rating, year, production;

        public MovieViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.rowMovieTitle);
            rating = itemView.findViewById(R.id.rowMovieRating);
            year = itemView.findViewById(R.id.rowMovieYear);
            production = itemView.findViewById(R.id.rowMovieStudio);
        }
    }
}


