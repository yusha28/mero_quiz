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
      public void changePassword(String pNum,String oldPass,String newPass){
      connection = new DbConnection();
      String selectQuery = String.format("Select * from registration where PhoneNumber = '%s'",pNum);
      ResultSet result = connection.retrieve(selectQuery);
      
      
      try{
          while(result.next()){
              String prevPass = result.getString("pass");
              if(prevPass.equals(oldPass)){
                  String updateQuery = String.format("update registration set pass='%s' where PhoneNumber='%s'",
              newPass,
              pNum);
                  connection.manipulate(updateQuery);
              }
          }
      }catch(SQLException e){
          e.printStackTrace();
      }
      
      }
      public void resetpassword(String pNum,String newpassword) {
      connection = new DbConnection();
      String selectQuery = String.format("Update registration set Password = '%s' where PhoneNumber='%s'",newpassword,pNum);
     
      int result = connection.manipulate(selectQuery);
      
      }
      
      public int insertImage(int id1,String image1){
        int id=id1;
        String image=image1;
     
        String updateQuery=String.format(
        "update registration set tr_image='%s' where clientid=%d",image,id);
        connection = new DbConnection();
    int result = connection.manipulate(updateQuery);
    return result;     
     }
      public int updateStudentProfile(int id, String name2, String email2, String number2) {
        String name =name2;
        String email=email2;
        String number=number2;
        
        String updateQuery = String.format(
                "update registration_table set tr_name='%s', tr_number='%s',tr_email='%s' where tr_id= %d",name ,number,email,id);
        connection = new DbConnection();
        int result = connection.manipulate(updateQuery);
        return result;
    }

      public int insertScore(int id,int score){
        connection = new DbConnection();
        String insertQuery = String.format("INSERT INTO score VALUES( %d,%d)",id,score);
        int result = connection.manipulate(insertQuery);
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