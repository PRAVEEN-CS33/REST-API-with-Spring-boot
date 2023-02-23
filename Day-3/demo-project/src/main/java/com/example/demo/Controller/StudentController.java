package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.Stdservice;

@RestController

public class StudentController {

@Autowired

private Stdservice stuservice;


@PostMapping("/addStudent")

public String postDetails (@RequestBody Student s)

{

stuservice.saveDetails(s);

return "Value added";

}

@GetMapping ("/getStudent")

public List<Student>getDetails()

{

return stuservice.getAllDetails();

}

}
