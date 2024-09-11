/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;
import java.util.Scanner;
import year_1.*;
import year_2.*;
/**
 *
 * @author sweth
 */
public class Studentmarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n:");
        n=obj.nextInt();
        year1marks obj1=new year1marks();
        year2marks obj2=new year2marks();
        int rollno;
        String name;
        int i=1;
        while (i<=n)
        {
           System .out.println("enter student details"+i);
           System .out.println("enter rollno:");
           rollno=obj.nextInt();
           System .out.println("enter name:");
           name=obj.next();
           System .out.println("enter mark1:");
           int m1=obj.nextInt();
           System .out.println("enter mark2:");
           int m2=obj.nextInt();
           System .out.println("enter mark3:");
           int m3=obj.nextInt();
           System .out.println("enter mark4:");
           int m4=obj.nextInt();
           System.out.println("");
           System.out.println("MARKS INFO");
           System.out.println("student roll number: "+rollno);
           System.out.println("student name: "+name);        
           System.out.println("RESULT 1"+obj1.sub1marks(m1));
           System.out.println("RESULT 2"+obj1.sub2marks(m2));
           System.out.println("RESULT 3"+obj2.sub3marks(m3));
           System.out.println("RESULT 4"+obj2.sub4marks(m4));
           i=i+1;        
        }      
    }
}
