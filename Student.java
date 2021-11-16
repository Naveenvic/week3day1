package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("m.naveen kumar");
		

	}
	public void studentDept() {
		System.out.println("mechanicl");

	}
	public void studentId() {
		System.out.println("student details");

	}
public static void main(String[] args) {
Student stu=new Student();
stu.deptName();
stu.studentDept();
stu.studentId();
stu.studentName();
stu.collegeCode();
stu.collegeName();
stu.collegeRank();
}
}
