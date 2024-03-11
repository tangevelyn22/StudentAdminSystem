package com.studentAdminProject.StudentAdminSystemProject.service;
import com.studentAdminProject.StudentAdminSystemProject.model.Student;
import com.studentAdminProject.StudentAdminSystemProject.repository.StudentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceInterface{

    @Autowired
    private StudentRepositoryInterface studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
