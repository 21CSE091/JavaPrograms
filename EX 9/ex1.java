/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;

/**
 *
 * @author sweth
 */
public class ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException{
        // TODO code application logic here
       FileOutputStream f =new FileOutputStream("file1.txt");
       String s="I like JAVA Programming";
       byte b[]=s.getBytes();
       f.write(b);
       int p;
       FileInputStream f1=new FileInputStream("file1.txt");
       System.out.println("the contents in file1 is");
       System.out.println(s);
       FileOutputStream f2=new FileOutputStream("duplicatefile1.txt");
       int r,a=0;
       while((r=f1.read())!=-1)
      {
          if(r>=65 && r<=90)
          {
           r=r+32;
           a=(char)r;
           f2.write(a);
          }
          else
          {
              a=(char)r;
              f2.write(a);
          }
       }
       FileInputStream f3=new FileInputStream("duplicatefile1.txt");
       System.out.println("the contents in file duplicate is");
       while((p=f3.read())!=-1)
       {
         System.out.print((char)p);  
       }
       System.out.println("\nContents in duplicate files is the lowercase of contents in file1");
    }
}