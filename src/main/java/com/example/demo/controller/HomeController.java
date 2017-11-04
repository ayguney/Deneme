package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Student;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "Home....";
	}
	
	@RequestMapping("/deneme")
	public String deneme(){
		return "Deneme....";
	}
	
	@RequestMapping("/student")
	public Student getStudent(){
		Student s = new Student (1L, "Metin", "Aln","3");
		return s;
	}
	
	@RequestMapping("/allStudent")
	public List<Student> getAllStudents (){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student (1L, "Metin", "Aln", "13"));
		list.add(new Student (2L, "Metin2", "Aln2", "23"));
		list.add(new Student (3L, "Metin3", "Aln3", "33"));
		list.add(new Student (4L, "Metin4", "Aln4", "43"));
		return list;
	}

}
