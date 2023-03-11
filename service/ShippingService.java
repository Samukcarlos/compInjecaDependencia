package service;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private OrderService orderService;

        public double shipment(double total) {

        if (total < 100)
            return 20.00;

        if (total > 100 && total < 200)
            return 12.00;

        if (total > 200.00)

            return 0.00;

        return 0.00;
    }
    }

