package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {

	
	public static boolean insetStudentToDB(Student st){
		 boolean flag=false;
		try {
			Connection con=CP.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the values of parameter 
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			//execute query
			pstmt.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return flag;
		
	}
	public static boolean deleteStudentToDB(int sId) {
		 boolean flag=false;
		try {
			Connection con=CP.createC();
			String q="delete from students where sid=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			
			//set the values of parameter 
			pstmt.setInt(1, sId);
			
			
			//execute query
			pstmt.executeUpdate();
			flag=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	public static void showAllStudent() {
		
		
			try {
				Connection con=CP.createC();
				String q="select * from students";
				//PreparedStatement
				Statement stmt=con.createStatement();
				
				ResultSet set=stmt.executeQuery(q);
				
				while(set.next()) {
					int id=set.getInt(1);
					String name=set.getString(2);
					String phone=set.getString(3);
					String city=set.getString(4);
					
					System.out.println("ID : " + id);
					System.out.println("Name : " + name);
					System.out.println("Phone : " + phone);
					System.out.println("City : " + city);
					System.out.println("+++++++++++++++++++++++");
					
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
	}
}
