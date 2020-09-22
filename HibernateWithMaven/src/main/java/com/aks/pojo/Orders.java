package com.aks.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "orders1")
public class Orders {

	@Id
//	@GeneratedValue
	private int orderId;
	@Column(name = "orderName_changed")
	private String orderName;
	private long orderCost;
	@Transient
	private String nothing;
	
	private OrderStatus orderStatus;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public long getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(long orderCost) {
		this.orderCost = orderCost;
	}

	public String getNothing() {
		return nothing;
	}

	public void setNothing(String nothing) {
		this.nothing = nothing;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
