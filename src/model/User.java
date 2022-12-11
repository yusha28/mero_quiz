/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package model;



/**
*
* @author prasa
*/
public class User {



  private String firstName=null;
  private String lastName=null;
  private String phoneNumber=null;
  private String email=null;
  private String password=null;
  
   public User(
    String firstName,
    String lastName,
    String phoneNumber,
    String email,
    String password
  ) {
    this.firstName = firstName;
    this.lastName = lastName;    
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.password = password;
  }






 public void setFirstName(String firstName) {
    this.firstName = firstName;
  }



 public void setLastName(String lastName) {
    this.lastName = lastName;
  }



 public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



 public void setEmail(String email) {
    this.email = email;
  }



 public void setPassword(String password) {
    this.password = password;
  }






 public String getFirstName() {
    return firstName;
  }



 public String getLastName() {
    return lastName;
  }



 public String getPhoneNumber() {
    return phoneNumber;
  }



 public String getEmail() {
    return email;
  }



 public String getPassword() {
    return password;
  }

}