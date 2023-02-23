package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class Stdservice {

@Autowired
private StudentRepo stu;

public Student saveDetails(Student s)

{

return stu.save(s);

}

public List<Student> getAllDetails()

{

return stu.findAll();

}

public String testRun() {
	return "Runnning";
}

}