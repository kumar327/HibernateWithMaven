package com.aks.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class OrderStatus {

	private String orderStatus;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
