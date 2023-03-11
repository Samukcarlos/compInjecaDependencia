package service;

import entities.Order;
import org.springframework.stereotype.Service;

@Service


public class OrderService {
private ShippingService shippingService;

    public double total (double basic, double discount){
        return basic-(basic * discount/100);
    }

    }
