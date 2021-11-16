package org.college;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(char name) {
		System.out.println(name);

	}
	public void getStudentInfo(String email) {
		System.out.println(email);

	}
	public void getStudentInfo(long phone) {
		System.out.println(phone);

	}
public static void main(String[] args) {
	Students stu=new Students();
	stu.getStudentInfo("8838187635");
	stu.getStudentInfo("naveen");
	stu.getStudentInfo(12);
    stu.getStudentInfo("naveen7595kumar@gmail.com");
}

}
