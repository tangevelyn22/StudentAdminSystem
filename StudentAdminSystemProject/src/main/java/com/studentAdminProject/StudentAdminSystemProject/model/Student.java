package com.studentAdminProject.StudentAdminSystemProject.model;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student_first_name", nullable = false)
    private String studentFirstName;
    @Column(name = "student_last_name", nullable = false)
    private String studentLastName;
    @Column(name = "date_of_birth", nullable = false)
    private String dateOfBirth;
    @Column(name = "street_address", nullable = false)
    private String streetAddress;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;
    @Column(name = "country_code", nullable = false)
    private String countryCode;
    @Column(name = "graduation_class", nullable = false)
    private int graduationClass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "student_first_name")
    public String getStudentFirstName() {
        return studentFirstName;
    }
    @Column(name = "student_first_name")
    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }
    @Column(name = "student_last_name")
    public String getStudentLastName() {
        return studentLastName;
    }
    @Column(name = "student_last_name")
    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
    @Column(name = "date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    @Column(name = "date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Column(name = "street_address")
    public String getStreetAddress() {
        return streetAddress;
    }
    @Column(name = "graduation_class")
    public int getGraduationClass() {
        return graduationClass;
    }
    @Column(name = "graduation_class")
    public void setGraduationClass(int graduationClass) {
        this.graduationClass = graduationClass;
    }
    @Column(name = "street_address")
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }

    @Column(name = "zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }
    @Column(name = "country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


}
