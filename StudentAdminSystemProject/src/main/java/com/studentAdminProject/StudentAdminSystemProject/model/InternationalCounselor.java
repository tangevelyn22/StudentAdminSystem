package com.studentAdminProject.StudentAdminSystemProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class InternationalCounselor extends UniversityStaff {
    @Column(name = "specialization", nullable = false)
    private String specialization;

}
