/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.quiz_Controller;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Quizpage extends javax.swing.JFrame {
        
    public static int questions = 0;
    public static int options = 0;
    public static int sec = 20;
    public static int questionCount = 1;
    public static Timer timer;
    public static String answer = "";
    public static int correctAnswer = 0;
    public static String category;
    public static int selectedNumberFromRandom;
    public boolean isOptionSelected;
    public static int randomNum;
    static int id;
    
    public Quizpage() {
        initComponents();
    }
    
    public Quizpage(int id, String category){
        this.category = category;
        this.id = id;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Questions = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        option1 = new javax.swing.JCheckBox();
        option2 = new javax.swing.JCheckBox();
        option3 = new javax.swing.JCheckBox();
        option4 = new javax.swing.JCheckBox();
        skip = new javax.swing.JButton();
        next = new javax.swing.JButton();
        timer1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        op1 = new javax.swing.JPanel();
        op2 = new javax.swing.JPanel();
        op3 = new javax.swing.JPanel();
        op4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Questions.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Questions.setText("Q.1. No Of Primitive Data Type In Java?");
        Questions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionsActionPerformed(evt);
            }
        });

        jTextField4.setText("Please choose one of the following answer.");

        option1.setText("6");
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });

        option2.setText("7");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        option3.setText("8");
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        option4.setText("9");
        option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option4ActionPerformed(evt);
            }
        });

        skip.setText("Skip");
        skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        timer1.setText("00");

        jLabel1.setText("Question no.");

        count.setText("1");

        jLabel3.setText("of 10");

        javax.swing.GroupLayout op1Layout = new javax.swing.GroupLayout(op1);
        op1.setLayout(op1Layout);
        op1Layout.setHorizontalGroup(
            op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        op1Layout.setVerticalGroup(
            op1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout op2Layout = new javax.swing.GroupLayout(op2);
        op2.setLayout(op2Layout);
        op2Layout.setHorizontalGroup(
            op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        op2Layout.setVerticalGroup(
            op2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout op3Layout = new javax.swing.GroupLayout(op3);
        op3.setLayout(op3Layout);
        op3Layout.setHorizontalGroup(
            op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        op3Layout.setVerticalGroup(
            op3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout op4Layout = new javax.swing.GroupLayout(op4);
        op4.setLayout(op4Layout);
        op4Layout.setHorizontalGroup(
            op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        op4Layout.setVerticalGroup(
            op4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(option4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(op2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(op1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(op3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(op4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Questions, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(count)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))))
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(skip)
                        .addGap(39, 39, 39)
                        .addComponent(next)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(timer1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(count)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addComponent(Questions, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(option1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(option2)
                        .addGap(18, 18, 18)
                        .addComponent(option3)
                        .addGap(18, 18, 18)
                        .addComponent(option4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(skip)
                    .addComponent(next))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionsActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if(questions == 10 && options ==10){
            timer1.setVisible(false);
            skip.setVisible(false);
            this.dispose();
            Result resultPage = new Result(correctAnswer, category, id);
            resultPage.setText1();
            resultPage.setVisible(true);
            System.out.println("CorrectAnswer "+correctAnswer);
        }
        
        if(questions < 10){
            if(isOptionSelected == true){
                performNext();
                option1.setEnabled(true);
                option2.setEnabled(true);
                option3.setEnabled(true);
                option4.setEnabled(true);
                System.out.println("Option Selected");
            }
        }
        
    }//GEN-LAST:event_nextActionPerformed

    private void skipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipActionPerformed
//
         if(questions < 10){
            performNext();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
        }
        if(questions == 10 && options ==10){
            skip.setVisible(true);
        }
    }//GEN-LAST:event_skipActionPerformed

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Category:"+" Red"); // this is correct to use
        answer = option1.getText();
        correctAnswer(answer);
        isOptionSelected = true;
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
    }//GEN-LAST:event_option1ActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        answer = option2.getText();
        correctAnswer(answer);
        isOptionSelected = true;
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
    }//GEN-LAST:event_option2ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        answer = option3.getText();
        correctAnswer(answer);
        isOptionSelected = true;
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
    }//GEN-LAST:event_option3ActionPerformed

    private void option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option4ActionPerformed
        answer = option4.getText();
        correctAnswer(answer);
        isOptionSelected = true;
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
    }//GEN-LAST:event_option4ActionPerformed
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quizpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quizpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quizpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quizpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quizpage().setVisible(true);
                
                randomIndex();
                if(randomNum == 1){
                questions = 15;
                }
                timerM();
//                timer = new Timer(1000, new ActionListener(){
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        
//                        if(sec >=0){  
//                        timer1.setText(String.valueOf(sec));
//                        sec--;
//                        }
//                        else{
////                            questionCount++;
//                            sec = 20;
//                            performNext();
//                            
//                        }
//                        
//                    }
//                    
//                });
//                
//                
//                
//                if(sec >= 0){
//                     performNext();// check here
//                     timer.stop();
//                     sec = 20;
//                }
//                
//                
//                timer.start();
//                // calling the methods
//                onAnswerSelected();
//                isCorrectAnswer();
//               
//                                
           }
        });
//        
        }
               
    public static void timerM(){
        timer = new Timer(1000, new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        if(sec >=0){  
                        timer1.setText(String.valueOf(sec));
                        sec--;
                        }
                        else{
//                            questionCount++;
                            sec = 20;
                            performNext();
                            
                        }
                        
                    }
                    
                });
        if(sec >= 0){
                     performNext();// check here
                     timer.stop();
                     sec = 20;
                }
                
                
                timer.start();  
                timer.start();
    }
//    public static void onAnswerSelected(){
//        option1.addItemListener(new ItemListener(){
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//                        if(e.getStateChange()==1){
//                            answer = option1.getText();
//                            if(isCorrectAnswer()){
//                                option1.setBackground(Color.green);//This code can be removed because correctAnswer is better.
//                            }
//                            else{
//                                option1.setBackground(Color.red);
//                            }
//                             correctAnswer();
//                        }
//                    }
//                
//                });
//        option2.addItemListener(new ItemListener(){
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//                        if(e.getStateChange()==1){
//                            answer = option2.getText();
//                        }
//                        if(isCorrectAnswer()){
//                                option2.setBackground(Color.green);//This code can be removed because correctAnswer is better.
//                            }
//                            else{
//                                option2.setBackground(Color.red);
//                            }
//                        correctAnswer();
//                    }
//                
//                });
//        option3.addItemListener(new ItemListener(){
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//                        if(e.getStateChange()==1){
//                            answer = option3.getText();
//                        }
//                        if(isCorrectAnswer()){
//                                option3.setBackground(Color.green);//This code can be removed because correctAnswer is better.
//                            }
//                            else{
//                                option3.setBackground(Color.red);
//                            }
//                         correctAnswer();
//                    }
//                
//                });
//        option4.addItemListener(new ItemListener(){
//                    @Override
//                    public void itemStateChanged(ItemEvent e) {
//                        if(e.getStateChange()==1){
//                            answer = option4.getText();
//                        }
//                        if(isCorrectAnswer()){
//                                option4.setBackground(Color.green); //This code can be removed because correctAnswer is better.
//                            }
//                            else{
//                                option4.setBackground(Color.red);
//                            }
//                         correctAnswer();
//                    }
//                
//                });
//    }
    public static boolean isCorrectAnswer(){
        Quiz quiz = new Quiz();
        if(answer.equals(quiz.getRightAnswer())) {   
            correctAnswer++;
        } 
        return false;
    }
    
    public static void correctAnswer(String answer){
        try{
        Quiz q;
        Quiz quiz = new Quiz();
        quiz_Controller controller = new quiz_Controller();
          List<Quiz> quizList = controller.m(category);
//            Random ran = new Random();
//            int index = ran.nextInt(0,2);// correct this code...........................................................................
            q = quizList.get(selectedNumberFromRandom);
            System.out.println("Selected Answer :"+ answer);
//            System.out.println("RightAnswer: "+q.getRightAnswer()+" "+option1.getText());
        if(option1.getText().equals(q.getRightAnswer())){
           op1.setBackground(Color.green);
            
        }
        else{
            op1.setBackground(Color.red);
        }
        if(option2.getText().equals(q.getRightAnswer())){
            op2.setBackground(Color.green);
        }
        else{
            op2.setBackground(Color.red);
        }
        if(option3.getText().equals(q.getRightAnswer())){
            op3.setBackground(Color.green);
        }
        else{
            op3.setBackground(Color.red); 
        }
        if(option4.getText().equals(q.getRightAnswer())){
            op4.setBackground(Color.green);
        }
        else{
            op4.setBackground(Color.red);
        }
        
        if(answer.equals(q.getRightAnswer())){
            correctAnswer++;
           }
            
        }
        catch(Exception e){
            System.out.println("Exception occur in correctAnswer "+ e);
            
        }
        
    }
    public static void performNext(){
        Quiz q;
        quiz_Controller controller = new quiz_Controller();
        Quiz quiz =  new Quiz(); 
        
        // use id and fetch data
        if(questions == 10 && options ==10){
            timer.stop();
            questions = 9;
            options = 9;
            
           
            timer1.setVisible(false);
            
        }
        if(questions == 9 && options == 9){
            next.setText("Submit");
        

        }
        else{
            next.setText("Next");
        }
        sec = 20;
        timer1.setVisible(true);
       
        try{
            op1.setBackground(Color.white);
            op2.setBackground(Color.white);
            op3.setBackground(Color.white);
            op4.setBackground(Color.white);
            option1.setSelected(false);
            option2.setSelected(false);
            option3.setSelected(false);
            option4.setSelected(false);
            System.out.println("Category: "+category);
            List<Quiz> quizList = controller.m(category);
//            Random ran = new Random();
//            int index = ran.nextInt(0,4);// correct this code...........................................................................
//            selectedNumberFromRandom = index;
             selectedNumberFromRandom = questions;
//            q = quizList.get(index);
            q = quizList.get(questions);
            Questions.setText(q.getQuestion());
            option1.setText(q.getOption1());
            option2.setText(q.getOption2());
            option3.setText(q.getOption3());
            option4.setText(q.getOption4());
            count.setText(String.valueOf(questionCount));
           if(randomNum == 1){
                questions--;
            }
            else{
                questions++;
            }
        }
        catch(Exception e){
            
        }
        
//        questions++;
        options++;
        questionCount++;
        
    }
    public static void randomIndex(){
        Random ran = new Random();
        int index = ran.nextInt(0,2);
        System.out.println(index);
        randomNum = index;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Questions;
    public static javax.swing.JLabel count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JButton next;
    public static javax.swing.JPanel op1;
    public static javax.swing.JPanel op2;
    public static javax.swing.JPanel op3;
    public static javax.swing.JPanel op4;
    public static javax.swing.JCheckBox option1;
    public static javax.swing.JCheckBox option2;
    public static javax.swing.JCheckBox option3;
    public static javax.swing.JCheckBox option4;
    private javax.swing.JButton skip;
    public static javax.swing.JLabel timer1;
    // End of variables declaration//GEN-END:variables
}
