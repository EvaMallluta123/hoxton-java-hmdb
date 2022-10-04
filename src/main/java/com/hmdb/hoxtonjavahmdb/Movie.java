package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Movie {
 
    public static ArrayList<Movie> movies = new ArrayList<>();
    // id, title, description, year, actors
     public Integer id;
     public  String title;
     public  String description;
     public Integer year;
     public Integer actorId;
     
     static {
        new Movie(1, "Star", "Two people who loves the stars", 2010, 1);
       new Movie(2, "Athena", "A killing film", 2012, 2);
       new Movie(3, "Sister", "A movie about two sisters", 2022, 2);
        }
     public Movie(Integer id, String title, String description, Integer year, Integer actorId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.actorId= actorId;
        
        Movie.movies.add(this);
      }
      
}
