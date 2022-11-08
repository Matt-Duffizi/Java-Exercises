package com.kafka;

import com.kafka.config.KafkaTopicConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Kafka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Kafka1Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String,String> template){
        return  args -> {
            template.send("tensorflow", "TensorFlow I have new data for you: :)");
        };
    };

}
