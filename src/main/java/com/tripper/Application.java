package com.tripper;

import com.tripper.entity.Event;
import com.tripper.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Calendar;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(EventRepository eventRepository) {
        return (args) -> {
            String description = "Lorem Ipsum";

            eventRepository.save(new Event(Calendar.getInstance(), Calendar.getInstance(), "XPTO", description));

            eventRepository.findByTitle("XPTO").forEach(e -> {
                log.info(e.getDescription().toString());
            });
        };
    }
}
