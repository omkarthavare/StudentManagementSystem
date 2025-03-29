package com.sit.Controller;

public class Student {
	public int Sid;
	public String Sname;
	public double Smarks;
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Smarks=" + Smarks + "]";
	}
	public Student(int sid, String sname, double smarks) {
		super();
		Sid = sid;
		Sname = sname;
		Smarks = smarks;
	}
	

}
