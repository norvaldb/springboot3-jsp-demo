package com.example.springbootjspdemo.service;


import com.example.springbootjspdemo.entity.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> getAll();
    Student getById(Integer id);
    void delete(Student student);
}