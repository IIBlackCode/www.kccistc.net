package com.test;
class Student2 {
	String name;
	public void gotoSchool() {
		System.out.println("�л��� �б��� ����.");
	}
}
class MiddleStudent2 extends Student2 {
	public void study() {
		System.out.println("���л��� �����ϴ�.");
	}
}
public class Test5 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.gotoSchool();
		MiddleStudent2 mstu = new MiddleStudent2();
		mstu.gotoSchool();
		mstu.study();
		mstu.name = "���л�";

	}
}