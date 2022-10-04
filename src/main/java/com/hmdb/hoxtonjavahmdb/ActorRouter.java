package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorRouter {
    @GetMapping("/actors")
  public ArrayList<Actor> getAllActtors() {
    return Actor.actors;
  }

}
