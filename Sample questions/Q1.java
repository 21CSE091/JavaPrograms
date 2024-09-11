/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oops.lab;
import java.util.Scanner;
/**
 *
 * @author sweth
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int marks[] = new int[5];
        int i;
        float total=0,avg;
        Scanner obj = new Scanner(System.in);
        for(i=0; i<5; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = obj.nextInt();
            total = total + marks[i];
        }
        avg = total/5;
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=80 && avg<90)
        {
            System.out.print("B");
        }
        else if(avg>=70 && avg<80)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}