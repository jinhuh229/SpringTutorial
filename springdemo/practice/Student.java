package com.luv2code.springdemo.practice;

public class Student implements Person{

	
	private Education education;
	
	
	private int StudentID;
	private String StudentName;
	
	
	// constructor for dependency injection
	public Student(Education education) {
		this.education = education;
	}

	// Setter and Getter for injecting literal values
	public int getStudentID() {
		return StudentID;
	}


	public void setStudentID(int studentID) {
		StudentID = studentID;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	@Override
	public String identify() {

		return "I am a Student";
	}

	@Override
	public String description() {

		return "The Georgia State University Student";
	}

	@Override
	public String getClassDescription() {
		// TODO Auto-generated method stub
		return education.ClassName();
	}
	
	

}
