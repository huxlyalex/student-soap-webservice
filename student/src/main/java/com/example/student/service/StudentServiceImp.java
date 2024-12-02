package com.example.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.api.student.StudentDetailsRequest;
import com.example.student.api.student.StudentDetailsResponse;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	StudentRepository studentrepository;

	@Override
	public StudentDetailsResponse getStudent(StudentDetailsRequest stud) {
		System.out.println(stud.getName());
		List<Student> stu = studentrepository.findByName(stud.getName());
		StudentDetailsResponse studentRespond = new StudentDetailsResponse();
		com.example.student.api.student.Student jaxbStu = mapToJaxbStudent(stu.get(0));
		studentRespond.setStudent(jaxbStu) ;
		return studentRespond;
		
		
	}

	public com.example.student.api.student.Student mapToJaxbStudent(Student entity) {
		com.example.student.api.student.Student jaxbStudent = new com.example.student.api.student.Student();
		jaxbStudent.setName(entity.getName());
		jaxbStudent.setStandard(entity.getStandard());
		jaxbStudent.setAddress(entity.getAddress());
		return jaxbStudent;
	}

}
