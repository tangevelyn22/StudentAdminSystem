package com.studentAdminProject.StudentAdminSystemProject.model;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @Column(name = "dept_code", nullable = false)
    private String departmentCode;

    @Column(name = "dept_description", nullable = false)
    private String departmentDescription;
}
