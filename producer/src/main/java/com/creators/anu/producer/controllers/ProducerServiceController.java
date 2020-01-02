package com.creators.anu.producer.controllers;

import com.creators.anu.producer.model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/v1/organizations/{organizationId}/producer/{producerId}")
public class ProducerServiceController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List<Order> listOrders(@PathVariable("organizationId") String organizationId,
                                  @PathVariable("producerId") String producerId) {
        List<Order> orders = new ArrayList<>();
        Map<UUID, Integer> items = new HashMap<>();
        items.put(UUID.randomUUID(), 2);
        items.put(UUID.randomUUID(), 1);
        items.put(UUID.randomUUID(), 3);
        Order order1 = new Order(UUID.randomUUID(), items);
        orders.add(order1);
        Order order2 = new Order(UUID.randomUUID(), items);
        orders.add(order2);

        return orders;
    }
}
