package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student milad = new Student(
                    "Milad",
                    "milad@gmail.com",
                    LocalDate.of(1989, APRIL,20)

            );
            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2000, APRIL,20)
            );
            repository.saveAll(
                    List.of(milad,alex)
            );
        };
    }
}
