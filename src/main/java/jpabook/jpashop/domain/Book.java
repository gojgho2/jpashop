package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Book extends Item{

  private String author;
  private String isbn;

  public String author() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String isbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}
