import java.net.SocketTimeoutException;

import javax.sound.sampled.SourceDataLine;

// public class practice {
//     public static void main(String args[])
//     {
//         // it insert a Tab Space
//         String str = "Astinvone\tdeStax";
//         System.out.println(str);
//         // it inserts a New Line
//         String str1 = "Morning\nshows the \nday";
//         System.out.println(str1);
//         // it insert a backslash
//         String str2 = "And\\Or";
//         System.out.println(str2);
//         // it insert a Carriage
//         String str3 = "Carriage\rRetur";
//         System.out.println(str3);
//         // it prints a single quote
//         String str4 = "Wall Street\'s";
//         System.out.println(str4);
//         // IT PRINTS DOUBLE QUOTE
//         String str5 = "Ujjwal\'Astinvone de Starx'Humagain";
//         System.out.println(str5);
//         String str6 = "Ujjwal";
//         System.out.println(str6);
//     }
    
// }
  
//
// 
// 
/* this is an example of multi-line comment.
the program prints "hello,world!" to the standard output.
 */

// class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Hello, world!");
//     }
// }
// class Demo
// {
//     static int m=100;//static variable
//     void method()
//     {
//         int n=90;//local variable
//     }
//     public static void main(String args[])
//     {
//         int data=50;//instance variable
//     }
// }//end of class
// class VariableExample{
//     int myVariable;
//     static int data = 30;

//     void method(){
//         int a = 100;
//         System.out.println("value of local variable a:"+a);

//     }
//     public static void main(String args[]){
//         VariableExample obj = new VariableExample();
//         obj.method();
//         System.out.println("Value of instance variable myVariable;"+obj.myVariable);
//         System.out.println("Value of static variable data:"+VariableExample.data);
//     }
// }
class Shape {
    draw() {
      System.out.println("Drawing Shape");
    }
  }
  
  class Circle extends Shape {
    @Override
    void draw() {
      System.out.println("Drawing Circle");
    }
  }
  