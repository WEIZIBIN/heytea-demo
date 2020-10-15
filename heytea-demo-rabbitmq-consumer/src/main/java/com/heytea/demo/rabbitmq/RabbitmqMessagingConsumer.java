package com.heytea.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.heytea.demo.rabbitmq.model.HeyteaMQBody;
import com.heytea.demo.rabbitmq.model.MessageVo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class RabbitmqMessagingConsumer {

    @RabbitListener()
    public void userQueueMessage(@Payload HeyteaMQBody<MessageVo> msg) {
        
        log.info("Recieved MessageVo Message: {}", msg);
    }

}