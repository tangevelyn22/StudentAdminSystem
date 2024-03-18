package com.studentAdminProject.StudentAdminSystemProject.controller;
import java.util.List;
import com.studentAdminProject.StudentAdminSystemProject.model.Student;
import com.studentAdminProject.StudentAdminSystemProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/addStudent")
    public boolean addAction(@RequestBody Student student) {
        Student test = this.studentService.createStudent(student);
        return true;
    }

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(this.studentService.getStudents(), HttpStatus.OK);
    }
}
