package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

  @Id
  @GeneratedValue
  @Column(name = "team_id")
  private Long teamId;

  private String name;

  @OneToMany
  @JoinColumn(name = "team_id")
  private List<Member> members = new ArrayList<>();

  public Long teamId() {
    return teamId;
  }

  public void setTeamId(Long teamId) {
    this.teamId = teamId;
  }

  public String name() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Member> members() {
    return members;
  }

  public void setMembers(List<Member> members) {
    this.members = members;
  }

  public void addMember(Member member) {
//    member.updateTeam(this);
    members.add(member);
  }

  @Override
  public String toString() {
    return "Team{" +
        "teamId=" + teamId +
        ", name='" + name + '\'' +
        ", members=" + members +
        '}';
  }
}
