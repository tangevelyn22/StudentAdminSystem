package com.studentAdminProject.StudentAdminSystemProject.repository;

import com.studentAdminProject.StudentAdminSystemProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryInterface extends JpaRepository<Student,Integer> {

}
