package controller;
import javax.sound.sampled.SourceDataLine;

import database.DbConnection;
import java.sql.*;

import model.Student;
public class StudentController{
    DbConnection connection;

    public int insertStudent(Student student){
        int id = student.getClientId();
        String name = student.getFirstName();
        String lastname = student.getLastName();
        String contact =  student.getPhoneNumber();
        String email =  student.getEmail();
        String password= student.getPassword();
        String insertQuery = String.format("INSERT INTO registration(FirstName,LastName,PhoneNumber,Email,Password) VALUES( '%s', '%s', '%s','%s', '%s')", name, lastname, contact, email,password);
        connection = new DbConnection();
        int result = connection.manipulate(insertQuery);
        return result;
       
    }
    public ResultSet retrieveStudent(String email, String password){
 
        String validQuery = String.format(
                "SELECT * FROM registration WHERE Email='%s' AND Password='%s'",email,password);
        connection = new DbConnection();
        ResultSet result = connection.retrieve(validQuery);
        return result;

    }
    
     public ResultSet retrieveStudent(String PhoneNumber ){
 
        String validQuery = String.format(
                "SELECT * FROM registration WHERE PhoneNumber='%s'" ,PhoneNumber);
        connection = new DbConnection();
        ResultSet result = connection.retrieve(validQuery);
        return result;

    }
}

//    public int updateStudent(Student student){
//         int id = student.getClientId();
//        String name = student.getFirstName();
//        String lastname = student.getLastName();
//        String contact =  student.getPhoneNumber();
//        String email =  student.getEmail();
//        String password= student.getPassword();
//        
//        String updateQuery = String.format("UPDATE tbl_students SET  FirstName = '%s', LastName = '%s', PhoneNumber = '%s', Email = '%s', Password='%s', Where ClientId= '%d',student, name,lastname,contact,email,password);
//
//
//
//        connection = new DbConnection();
//        int result = connection.manipulate(updateQuery);
//        return result;
//    }
//    
//
//
//}