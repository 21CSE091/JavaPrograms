/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author sweth
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the file:");
        String file_name = input.nextLine();
        File f = new File(file_name);
        if(f.exists())
            System.out.println("The file " +file_name+ " exists");
        else
            System.out.println("The file " +file_name+ " does not exist");
        if(f.exists()){
            if(f.canRead())
                System.out.println("The file " +file_name+ " is readable");
            else
                System.out.println("The file " +file_name+ " is not readable");
            if(f.canWrite())
                System.out.println("The file " +file_name+ " is writeable");
            else
                System.out.println("The file " +file_name+ " is not writeable");
        System.out.println("The file type is: " +file_name.substring(file_name.indexOf('.')+1));
        System.out.println("The Length of the file:" +f.length());
        }
    }
}