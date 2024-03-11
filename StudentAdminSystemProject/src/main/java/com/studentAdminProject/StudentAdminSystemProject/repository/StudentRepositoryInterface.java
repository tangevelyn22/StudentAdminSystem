package com.studentAdminProject.StudentAdminSystemProject.repository;

import com.studentAdminProject.StudentAdminSystemProject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryInterface extends JpaRepository<Student,Integer> {

}
