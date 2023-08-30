/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PRG381_Project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 *
 * @author rulud
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long studentID;
    private String studentName;
    private String studentAddress;
    private String email;
    private String password;
    private String courseName;
    public Student() {
    }

    public Student(Long studentID, String studentName, String studentAddress, String email, String password, String courseName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.email = email;
        this.password = password;
        this.courseName = courseName;
    }

    public Long getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
}