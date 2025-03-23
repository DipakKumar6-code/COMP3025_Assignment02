//package com.example.cineplex_movies2025.Models;
//
//import com.google.gson.annotations.SerializedName;
//
//import java.io.Serializable;
//
//public class Movie implements Serializable {
//    @SerializedName("Title")
//    private String title;
//
//    @SerializedName("Year")
//    private String year;
//
//    @SerializedName("Rated")
//    private String rated;
//    @SerializedName("Plot")
//    private String plot;
//
//    @SerializedName("Production")
//    private String production;
//
//    @SerializedName("imdbRating")
//    private String imdbRating;
//    @SerializedName("Poster")
//    private String poster;
//    @SerializedName("Language")
//    private String language;
//
//    @SerializedName("Actors")
//    public String getActors() {
//        return actors;
//    }
//
//    @SerializedName("Country")
//    public String getCountry() {
//        return country;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
//
//    private String country;
//    private String actors;
//
//    // Getters
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getProduction() {
//        return production;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public String getPlot() {
//        return plot;
//    }
//
//    public String getImdbRating() {
//        return imdbRating;
//    }
//
//    public String getPoster() {
//        return poster;
//    }
//}

package com.example.cineplex_movies2025.Models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Movie implements Serializable {
    @SerializedName("imdbID")
    private String imdbID;

    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private String year;

    @SerializedName("Plot")
    private String plot;

    @SerializedName("Production")
    private String production;

    @SerializedName("imdbRating")
    private String imdbRating;

    @SerializedName("Poster")
    private String poster;

    // Getters
    public String getImdbID() {
        return imdbID;
    }
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getPlot() {
        return plot;
    }

    public String getProduction() {
        return production;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public String getPoster() {
        return poster;
    }

}
