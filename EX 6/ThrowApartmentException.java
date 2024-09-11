/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwapartmentexception;
import java.util.Scanner;
/**
 *
 * @author sweth
 */
public class ThrowApartmentException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        apartment obj[]=new apartment[5];
        for(int i=0;i<obj.length;i++)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter address");
            String add;
            add = s.next();
            System.out.println("enter apartment number");
            int aptno=s.nextInt();
            System.out.println("enter no.of bedroom");
            int bedno=s.nextInt();
            System.out.println("enter apartment rent");
            int rent=s.nextInt();
            obj[i]=new apartment(add,aptno,bedno,rent);
        }
    }  
}