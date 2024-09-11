/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author sweth
 */
public class ex3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException,FileNotFoundException {
        // TODO code application logic here
       FileOutputStream f2=new FileOutputStream("file2.txt");
       String s="java";
       byte b[]=s.getBytes();
       f2.write(b);
       System.out.println("BYTE STREAM");
       System.out.println("");
       System.out.println("file2 created successfully");
       FileInputStream f3 =new FileInputStream("file2.txt");
       int r,a,i=0;
       System.out.println("contents in file2");
       while((a=f3.read())!=-1)
       {
         System.out.print((char)a);  
       }
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("CHARACTER STREAM");
        System.out.println("");
        FileWriter f4=new FileWriter("file4.txt");
        f4.write("oops");
        System.out.println("file4 created successfully");
        FileReader f5=new FileReader("file4.txt");
        System.out.println("contents in file4");
        while((a=f5.read())!=-1)
        {
          System.out.print((char)a);  
        }
        System.out.println("");
        f4.close();
        f5.close();
    }   
}