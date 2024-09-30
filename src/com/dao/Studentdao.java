package com.dao;

import java.sql.*;

public class Studentdao {
	public void insertData() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		Statement st =  con.createStatement();
		st.executeUpdate("insert into student values(4,'Sanjana',21,'Delhi')");
		System.out.println("Data inserted successfully");
		st.close();
		con.close();
	}
	
	public void UpdateData() throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
		Statement st =  con.createStatement();
		st.executeUpdate("update student set name='Om' where id=2");
		System.out.println("Data updated successfully");
		st.close();
		con.close();
	}
	
	public void fetchAllRecords() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
			Statement st =  con.createStatement();
			ResultSet rs = st.executeQuery("select *from student;");
			while(rs.next()) {
				System.out.println("ID: "+rs.getInt(1)+", Name: "+rs.getString(2)+", Age: "+rs.getInt(3)+", City: "+rs.getString(4));
			}
			rs.close();
			st.close();
			con.close();
	}
	
	public void deleteData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp","root","Student@321");
			Statement st =  con.createStatement();
			st.executeUpdate("delete from student where id=9;");
			System.out.println("Data deleted successfully");
			st.close();
			con.close();
	}
}
