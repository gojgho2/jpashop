package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Album extends Item{

  private String artist;
  private String etc;

  public String artist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String etc() {
    return etc;
  }

  public void setEtc(String etc) {
    this.etc = etc;
  }
}
