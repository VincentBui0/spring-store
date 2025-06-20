package com.vincentbui.store;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StoreApplication.class, args);
		var OrderService = new OrderService(new PayPalPaymentService());
		OrderService.placeOrder();
	}

}
