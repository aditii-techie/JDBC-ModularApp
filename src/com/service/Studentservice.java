package com.service;
import java.sql.SQLException;
import com.dao.Studentdao;

public class Studentservice {
	public void insertRecord() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.insertData();
	}
	
	public void updateRecord() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.UpdateData();
	}
	
	public void fetchAllRecord() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.fetchAllRecords();
	}
	
	public void deleteRecord() throws ClassNotFoundException, SQLException {
		Studentdao sd = new Studentdao();
		sd.deleteData();
	}

}
