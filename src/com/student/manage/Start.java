package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			System.out.println("Press 1 to insert student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to dispaly student");
			System.out.println("Press 4 to exit app");
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				//add student
				System.out.println("enter user name :");
				String name=br.readLine();
				
				System.out.println("enter user phone :");
				String phone=br.readLine();
				
				System.out.println("enter user city :");
				String city=br.readLine();
				
				Student st=new Student(name,phone,city);
				boolean answer=StudentDao.insetStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfully...");
				}
				else {
					System.out.println("Somthing went wrong try again...");
				}
			}else if(c==2) {
				System.out.println("Enter student id to delete: ");
				int sId=Integer.parseInt(br.readLine());
				boolean answer=	StudentDao.deleteStudentToDB(sId);
				if(answer) {
					System.out.println("Student is deleted successfully...");
				}
				else {
					System.out.println("Somthing went wrong try again...");
				}				
			}else if(c==3) {
				StudentDao.showAllStudent();
				
			}else {
				break;
			}
			
			
		}

	}

}
