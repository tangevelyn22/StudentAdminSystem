package com.studentAdminProject.StudentAdminSystemProject.model;

import jakarta.persistence.*;

@Entity
public class Professor extends UniversityStaff{

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "dept_code", nullable = false)
    private String departmentCode;

    private String title;
}
