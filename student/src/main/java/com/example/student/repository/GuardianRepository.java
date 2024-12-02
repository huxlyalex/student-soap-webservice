package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Long>
{

}
