package com.educandoweb.course.entities.enums;

public enum OrderStauts {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStauts(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStauts valueOf (int code) {
		for (OrderStauts value : OrderStauts.values()) {
			if (value.getCode() == code ) {
				return  value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
