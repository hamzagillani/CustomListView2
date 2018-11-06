package com.digicon_valley.customlistview;

public class MovieDataProvider {

    private  int movie_poster_res;
    private String movie_title;
    private String movie_rating;

    public int getMovie_poster_res() {
        return movie_poster_res;
    }

    public void setMovie_poster_res(int movie_poster_res) {
        this.movie_poster_res = movie_poster_res;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public MovieDataProvider(int movie_poster_res,String movie_title,String movie_rating){

        this.setMovie_poster_res(movie_poster_res);
        this.setMovie_title(movie_title);
        this.setMovie_rating(movie_rating);
    }

    public void setMovie_rating(String movie_rating) {
        this.movie_rating = movie_rating;
    }
}
