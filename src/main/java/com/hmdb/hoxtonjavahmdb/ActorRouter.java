package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorRouter {
    @GetMapping("/actors")
  public ArrayList<Actor> getAllActtors() {
    return Actor.actors;
  }
  @GetMapping("/actors/{id}")
  public Actor getSingleActor(@PathVariable Integer id) {
    Actor match = null;

    for (Actor actor : Actor.actors) {
      if (actor.id == id) {
        match = actor;
      }
    }

    if (match == null)
      throw new Error("Cat nout found.");

    return match;
  }
  @GetMapping("/movies")
  public ArrayList<Movie> getAllMovies() {
    return Movie.movies;
  }

}
