package com.hayman.spring.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent() {
        return List.of(new Student(
                1L,
                "Hayman",
                25,
                LocalDate.of(1996, Month.NOVEMBER, 7),
                "hayman@hotmail.com"));
    }
}
