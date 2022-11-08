package com.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "tensorflow",groupId ="groupID_1")
    void listerner(String data){
        System.out.println("Listener received: " + data + "!!!");
    }
}
