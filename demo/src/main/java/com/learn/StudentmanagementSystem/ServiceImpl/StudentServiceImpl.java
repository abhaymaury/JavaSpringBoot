package com.learn.StudentmanagementSystem.ServiceImpl;

import com.learn.StudentmanagementSystem.Entity.Student;
import com.learn.StudentmanagementSystem.Repository.StudentRepository;
import com.learn.StudentmanagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
