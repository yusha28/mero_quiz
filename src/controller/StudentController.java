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
        String insertQuery = String.format("INSERT INTO registration VALUES(%d, '%s', '%s', '%s','%s', '%s')", id, name, lastname, contact, email,password);
        connection = new DbConnection();
        int result = connection.manipulate(insertQuery);
        return result;
       
    }
    public ResultSet validTraveller(String email, String number){
 
        String validQuery = String.format(
                "SELECT * FROM registration_table WHERE tr_email='%s' AND tr_number='%s'",email,number);
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