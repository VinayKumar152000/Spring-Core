package com.spring.jdbc.Springjdbc;

import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Student {

	
	private int studentId;
	private String studentName;
	private String studentAddress;
	private List<Integer> studentMarks;
	private Certi certi;

	public Student() {
		System.out.println("88dga");
	}
	public Student(int studentId, String studentName, String studentAddress, List<Integer> studentMarks, Certi certi) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentMarks = studentMarks;
		this.certi = certi;
		System.out.println("ellkdga");

	}
	// every bean is having two method which spring ioc provide it, i.e init()-> we
	// can intilalize fields init,destory()-> called
	// when to release resources acquired by bean

//	public void init() {
//		System.out.println("Init method is called");
//	}
//
//	public void destroy() {
//		System.out.println("Destroy method is called");
//	}
}
