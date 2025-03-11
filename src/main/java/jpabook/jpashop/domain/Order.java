package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

  @Id
  @GeneratedValue
  @Column(name = "order_id")
  private Long id;
  //
//  @Column(name = "memeber_id")
//  private Long memberId;
  @ManyToOne
  @JoinColumn(name = "member_id")
  private Member member;

  @OneToMany(mappedBy = "order")
  private List<OrderItem> orderItems = new ArrayList<>();

  private LocalDateTime orderDate;

  @Enumerated(EnumType.STRING)
  private OrderStatus status;

  public void addOrderItem(OrderItem orderItem) {
    orderItems.add(orderItem);
    orderItem.setOrder(this);
  }

  public Long id() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Member member() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public LocalDateTime orderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public OrderStatus status() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }



}
