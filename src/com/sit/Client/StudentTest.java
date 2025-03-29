package com.sit.Client;
import java.util.Scanner;

import com.sit.Controller.Student;

public class StudentTest {

	static int  index =0;
	static int Maxvalue=10;
	static Student[] Student=new Student[10];
	

	public static void main(String[] args) {

		
		while(true) {
			System.out.println("Welcome to Student Management System");
			System.out.println("menues:\n 1.Add Student \n 2.Display All Student Records \n 3.Search Student by Id \n 4.search student by name \n 5.search student whose marks is greater than 70 \n 6search student whose marks is less than 70\n");
			Scanner sc=new Scanner(System.in);
			int choices=sc.nextInt();
			
			switch(choices) {
			case 1:{
//				if(index<Maxvalue)
//				{
//					System.out.println("Enter student details");
//					Student s=new Student(sc.nextInt(),sc.next(),sc.nextDouble());
//					System.out.println("student added succefully");
//					Student[index++]=s;
//				}else
//				{
//					System.out.println("array size overflow can't add student information");
//				}
				System.out.println("Enter the student details");
				int id=sc.nextInt();
				boolean isfound=false;
				for(Student obj1:Student) {
					if(obj1!=null) {
						if(obj1.Sid==id) {
							isfound=true;
							System.out.println("id is already exist");
							break;
						}
					}
					if(!isfound) {
						System.out.println("congrats id is not present you can add");
						System.out.println("enter additional details sname ,smarks");
						Student s=new Student(id,sc.next(),sc.nextDouble());
						Student[index++]=s;
						System.out.println("student record added suceesfully!!");
						
					}
				}
			}break;
			case 2:{
				System.out.println("All Student information");
				for(Student obj: Student) {
					if(obj !=null) {
						System.out.println(obj);
					}
				}
			}break;
			case 3:{
				System.out.println("enter the student id to searched student");
				int searchid=sc.nextInt();
				boolean found=false;
				for(Student obj:Student) {
					if(obj !=null) {
						if(obj.Sid==searchid) {
							found=true;
							System.out.println(obj);
						}
					}
				}
				if(!found) {
					System.out.println("sorry ! id not found");
				}
				}break;
			case 4:{
				System.out.println("thank you for using this application");
				System.exit(0);
			}
			
			}
			
		}
		
	}
}
