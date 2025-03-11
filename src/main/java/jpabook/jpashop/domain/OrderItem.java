package jpabook.jpashop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {

  @Id
  @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

//  @Column(name = "order_id")
//  private Long orderId;

//  private Long itemId;

  public Long id() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order order() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Item item() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  public int orderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(int orderPrice) {
    this.orderPrice = orderPrice;
  }

  public int count() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private Item item;


  private int orderPrice;

  private int count;
}
