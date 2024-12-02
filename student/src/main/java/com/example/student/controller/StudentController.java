package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.student.api.student.StudentDetailsRequest;
import com.example.student.api.student.StudentDetailsResponse;
import com.example.student.service.StudentService;

@Endpoint
public class StudentController {
	
	private static final String NAMESPACE = "http://student.example.com/api/student";
	
	@Autowired
	StudentService studentservice;
	
	@PayloadRoot(namespace = NAMESPACE,localPart = "StudentDetailsRequest")
	@ResponsePayload
	public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request)
	{
		return studentservice.getStudent(request);
	}

}
