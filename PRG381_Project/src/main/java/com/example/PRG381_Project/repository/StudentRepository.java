/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PRG381_Project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.PRG381_Project.domain.Student;
/**
 *
 * @author rulud
 */


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}