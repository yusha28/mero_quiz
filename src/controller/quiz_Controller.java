/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.Quiz;

/**
 *
 * @author Acer
 */
public class quiz_Controller {
      public List<Quiz> m(String category)throws SQLException{
         List<Quiz> quizList = new ArrayList<>(); 
        DbConnection connection = new DbConnection();
//        String query = String.format("select * from programmingLanguage");
//        String query = String.format("select * from "+category);
      String query = String.format("select * from "+category);
        ResultSet result = connection.retrieve(query);
        System.out.println(query);

        while(result.next()){
        Quiz quiz = new Quiz();
        quiz.setQuestion(result.getString("question"));
        quiz.setOption1(result.getString("option1"));
        quiz.setOption2(result.getString("option2"));
        quiz.setOption3(result.getString("option3"));
        quiz.setOption4(result.getString("option4"));
        quiz.setRightAnswer(result.getString("correctAnswer"));
        quizList.add(quiz);
//        System.out.format("%s,%s",result.getString("question"),result.getString("option1"));
//        System.out.format("%s,%s",quiz.getQuestion(),quiz.getOption1());
        }
        result.close();
        return quizList;
      }
    
}
