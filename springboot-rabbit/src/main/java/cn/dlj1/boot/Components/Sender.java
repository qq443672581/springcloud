package cn.dlj1.boot.Components;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String msg) {
        String context = "[" + new Date() +"]" + msg;
        System.out.println("Sender : " + msg);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}
