package com.example.student_service.service;

import com.example.student_service.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        return List.of(
            new Student(1L, "Budi", "budi@example.com"),
            new Student(2L, "Siti", "siti@example.com"),
            new Student(3L, "Andi", "andi@example.com")
        );
    }
}