package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Movie extends Item{

  private String director;
  private String actor;

  public String director() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String actor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "director='" + director + '\'' +
        ", actor='" + actor + '\'' +
        '}';
  }
}
