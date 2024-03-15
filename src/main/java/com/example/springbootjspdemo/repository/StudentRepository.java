package com.example.springbootjspdemo.repository;
import com.example.springbootjspdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
