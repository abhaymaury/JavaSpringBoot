package com.learn.StudentmanagementSystem.Repository;

import com.learn.StudentmanagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
