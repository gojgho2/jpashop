package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BaseEntity{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long memberId;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();

  @Column(name = "user_name")
  private String userName;

  private String city;

  private String street;

  private String zipcode;

  public Long memberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public List<Order> orders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  public String userName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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
