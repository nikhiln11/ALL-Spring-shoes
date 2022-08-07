package com.dbs.jms;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ProducerController {
    
    
    @Autowired
    private RabbitTemplate template;
    
     @PostMapping("/{restaurantName}")
     public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
            order.setOrderId(UUID.randomUUID().toString());
            
            OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed succesfully in " + restaurantName);
            
            template.convertAndSend(DBSJMSConfig.EXCHANGE, DBSJMSConfig.ROUTING_KEY, orderStatus);
            
            return "Success !!";
        }
       
}
