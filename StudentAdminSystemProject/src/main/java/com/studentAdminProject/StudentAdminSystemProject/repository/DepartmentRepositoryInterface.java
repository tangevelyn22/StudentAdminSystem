package com.studentAdminProject.StudentAdminSystemProject.repository;

import com.studentAdminProject.StudentAdminSystemProject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepositoryInterface extends JpaRepository<Department, String> {
}
