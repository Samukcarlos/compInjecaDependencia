package com.scm.componenteInjecaoDependencia;

import ch.qos.logback.core.net.SyslogOutputStream;
import entities.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.OrderService;
import service.ShippingService;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan("com.scm")
public class ComponenteInjecaoDependenciaApplication implements CommandLineRunner {

public ComponenteInjecaoDependenciaApplication(OrderService orderService, ShippingService shippingService){
	this.shippingService = shippingService;
	this.orderService = orderService;
}

	public static void main(String[] args) {
		SpringApplication.run(ComponenteInjecaoDependenciaApplication.class, args);
	}

	private ShippingService shippingService;
	private OrderService orderService;
	private Order order;

	@Override
	public void run(String... args) throws Exception {








	}
}
