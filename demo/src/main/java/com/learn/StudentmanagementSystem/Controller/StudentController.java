package com.learn.StudentmanagementSystem.Controller;

import com.learn.StudentmanagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents (Model model){
        model.addAttribute("students" ,studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/student")
    public String getAll (Model model){
        model.addAttribute("student" ,"hello bro");
        return "student";
    }
}
