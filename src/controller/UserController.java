package controller;



import database.DbConnection;
import java.sql.*;
import model.User;



public class UserController {



 // database connection
  DbConnection dbConnection;



 public int insertUser(User user) {
    // getting user info




    String userFirstName = user.getFirstName();
    String userLastName = user.getLastName();
    String userPhoneNumber = user.getPhoneNumber();
    String userEmail = user.getEmail();
    String userPassword = user.getPassword();



   // code to add user
    String insertQuery = String.format(
      "INSERT INTO user_data VALUES('%s', '%s', %s, '%s', '%s')",
      userFirstName,
      userLastName,
      userPhoneNumber,
      userEmail,
      userPassword

    );



   dbConnection = new DbConnection();



   int result = dbConnection.manipulate(insertQuery);
    return result;
  }



 public User forgotPassword(String phoneNumber, String favFood, String pw) {
    dbConnection = new DbConnection();
    String selectQuery = String.format(
      "select * from user_data where phone_number='%s' and favourite_food='%s'",
      phoneNumber,
      favFood
    );
    String updateQuery = String.format(
      "update user_data set pass='%s' where phone_number='%s'",
      pw,
      phoneNumber
    );
    System.out.println(selectQuery);
    ResultSet result = dbConnection.retrieve(selectQuery);



   int newResult = dbConnection.manipulate(updateQuery);
    try {
      while (result.next()) {
        String fName = result.getString("first_name");
        String email = result.getString("email");
        String password = result.getString("pass");
        User retrieve_user = new User(
          null,
          null,
          null,
          email,
          password
        );
        //          System.out.println(result.getString("first_name"));
        return retrieve_user;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }



 public User loginPage(String pnum, String pass) {
    dbConnection = new DbConnection();
    String selectQuery = String.format("select email,pass from user_data where email='%s'",pnum);
    System.out.println(selectQuery);
    ResultSet result = dbConnection.retrieve(selectQuery);
    try {
      while (result.next()) {
        String DbPnum = result.getString("email");
        String Dbpass = result.getString("pass");
        User retriver_user = new User(
          null,
          null,
          null,
          DbPnum,
          Dbpass
        );



       return retriver_user;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }



   return null;
  }
}