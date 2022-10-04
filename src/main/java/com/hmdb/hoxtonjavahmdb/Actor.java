package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();
     public Integer id;
     public  String first_name;
     public  String last_name;
     public Integer year_of_birth;
     public Integer movieId;
     static {
       new Actor(1, "Eva", "MAlluta", 2000,1);
       new Actor(1, "Alex", "MAlluta", 2007,1);

       new Actor(2, "Diana", "Malluta", 1998,2);

        }
     public Actor(Integer id, String first_name, String last_name, Integer year_of_birth, Integer movieId ){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.year_of_birth = year_of_birth;
        this.movieId = movieId;
        
        
        Actor.actors.add(this);
      }
    
}
