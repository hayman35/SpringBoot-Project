package com.hayman.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student hayman = new Student(
                  "Hayman",
                    LocalDate.of(1996,11, 7),
                    "hayman@hot"
            );
            Student simon = new Student(
                    "Simon",
                    LocalDate.of(1993,12,17),
                    "Simon@hot"
            );
            repository.saveAll(
                    List.of(hayman,simon)
            );
        };
    }
}
