package com.studentAdminProject.StudentAdminSystemProject.repository;

import com.studentAdminProject.StudentAdminSystemProject.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepositoryInterface extends JpaRepository<Course, Integer> {
}
