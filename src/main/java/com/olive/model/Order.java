package com.olive.model;

public class Order {
	private int orderId;
	private String orderCode;
	private double orderCost;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	public Order(int orderId, String orderCode, double orderCost) {
		super();
		this.orderId = orderId;
		this.orderCode = orderCode;
		this.orderCost = orderCost;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderCode=" + orderCode + ", orderCost=" + orderCost + "]";
	}

}
