package com.dbs.jmsc;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@Component
public class DBSJMSConsumer {
    
    
    @RabbitListener(queues = "dbs_queue_batch6")
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}
