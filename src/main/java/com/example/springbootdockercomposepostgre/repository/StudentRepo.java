package com.example.springbootdockercomposepostgre.repository;



import com.example.springbootdockercomposepostgre.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
