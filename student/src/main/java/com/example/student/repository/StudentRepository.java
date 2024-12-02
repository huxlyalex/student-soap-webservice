package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	List<Student> findByName(String name);

}
