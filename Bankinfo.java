package org.system;

public class Bankinfo {
	public  void saving() {
		System.out.println("savings is 45%");

	}
	public void fixed() {
		System.out.println("fiixed is 50%");

	}
public void deposit() {
	System.out.println("deposite is 5% ");

}
public static void main(String[] args) {
	Bankinfo bank=new Bankinfo();
	bank.deposit();
	bank.fixed();
	bank.saving(); 
}
}
