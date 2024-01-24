package com.learn.StudentmanagementSystem.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_management_System")
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String address;
}
