import java.io.*;

import java.util.Scanner;

public class assignment5 {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Scanner input=new Scanner(System.in);
       printGPA(input);
    
   }

   public static void printGPA(Scanner input) {
       // TODO Auto-generated method stub
       String name;
       int tests,score;
       double avg=0.0;
    
       System.out.print("Enter a student record: ");
       name=input.next();
       tests=input.nextInt();
    
       for (int i=0;i<tests;i++)
       {    
           score=input.nextInt();
           avg+=score;
       }
           avg= avg/tests;
           System.out.println(name+"s grade is: "+avg);
        
   }    
   }