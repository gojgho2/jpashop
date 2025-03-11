package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long memberId;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();

  @Column(name = "user_name")
  private String userName;

  @ManyToOne
  @JoinColumn(name = "team_id",insertable = false, updatable = false)
  private Team team;

  public Long memberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public String userName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }



  @Override
  public String toString() {
    return "Member{" +
        "memberId=" + memberId +
        ", userName='" + userName + '\'' +
//        ", team=" + team +
        '}';
  }
}
