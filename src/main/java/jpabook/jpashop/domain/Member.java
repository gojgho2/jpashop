package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "member_id")
  private Long id;
  private String name;
  private String city;
  private String street;
  private String zipcode;

  public Long id() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String name() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String city() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String street() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String zipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
}
