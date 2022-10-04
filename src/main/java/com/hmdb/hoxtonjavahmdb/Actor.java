package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();
     public Integer id;
     public  String first_name;
     public  String last_name;
     public Integer year_of_birth;
     static {
       new Actor(1, "Eva", "MAlluta", 2000);
       new Actor(2, "Diana", "Malluta", 1998);

        }
     public Actor(Integer id, String first_name, String last_name, Integer year_of_birth) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.year_of_birth = year_of_birth;
        
        Actor.actors.add(this);
      }
      public void displayInfo() {
        String message = "This is %s, who is %s year(s) old. %s %s cuddles!\n";
        System.out.printf(message, this.first_name, this.last_name, this.year_of_birth);
      }
}
