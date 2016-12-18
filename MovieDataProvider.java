package com.example.abymani.workinglistview;

/**
 * Created by abymani on 19/12/2016.
 */

public class MovieDataProvider {
    private int moviePosterResource;
    private String MovieTitle;
    private String MovieRating;

    public MovieDataProvider(int moviePosterResource, String movieTitle, String movieRating) {
        this.moviePosterResource = moviePosterResource;
        this.MovieTitle = movieTitle;
        this.MovieRating = movieRating;
    }

    public int getMoviePosterResource() {
        return moviePosterResource;
    }

    public String getMovieTitle() {
        return MovieTitle;
    }

    public String getMovieRating() {
        return MovieRating;
    }

    public void setMoviePosterResource(int moviePosterResource) {
        this.moviePosterResource = moviePosterResource;
    }

    public void setMovieTitle(String movieTitle) {
        MovieTitle = movieTitle;
    }

    public void setMovieRating(String movieRating) {
        MovieRating = movieRating;
    }


}
