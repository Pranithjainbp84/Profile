package com.studentsystem.service;

import java.util.List;

import com.studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
