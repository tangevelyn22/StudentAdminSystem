package com.studentAdminProject.StudentAdminSystemProject.service;

import com.studentAdminProject.StudentAdminSystemProject.model.Student;
import java.util.List;

public interface StudentServiceInterface {
    public Student createStudent(Student student);
    public List<Student> getStudents();
}
