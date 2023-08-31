package com.example.PRG381_Project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.PRG381_Project.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
