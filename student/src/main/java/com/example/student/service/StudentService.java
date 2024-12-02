package com.example.student.service;

import com.example.student.api.student.StudentDetailsRequest;
import com.example.student.api.student.StudentDetailsResponse;

public interface StudentService {
	
	StudentDetailsResponse getStudent (StudentDetailsRequest stud);

}
