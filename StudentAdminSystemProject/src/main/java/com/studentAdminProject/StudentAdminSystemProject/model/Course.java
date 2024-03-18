package com.studentAdminProject.StudentAdminSystemProject.model;

import java.util.*;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "course_description", nullable = false)
    private String courseDescription;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "dept_code", nullable = false)
    private String departmentCode;

    @Column(name = "course_code", nullable = false)
    private int courseCode;

}
