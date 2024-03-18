package com.studentAdminProject.StudentAdminSystemProject.repository;

import com.studentAdminProject.StudentAdminSystemProject.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepositoryInterface extends JpaRepository<Professor, Integer> {
}
