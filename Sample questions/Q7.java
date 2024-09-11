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
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("ENTER NO OF OBJECTS-->"); 
        Scanner o=new Scanner(System.in);
        n=o.nextInt();
        car ob[]=new car[n]; 
        for(int i=1;i<=n;i++)
        {
            System.out.println(" 1.TRANSPORT VEHICLES "); 
            System.out.println(" 2.PRIVATE VEHICLES ");
            System.out.println(" ENTER YOUR CHOICE "); 
            int ch=o.nextInt();
            if(ch==1)
            {
                System.out.println(" ENTER VALIDITY NUMBER--> "); 
                int v=o.nextInt();
                System.out.println(" ENTER START DATE-->"); 
                String s=o.next();
                System.out.println(" ENTER PERIOD--> "); 
                String p=o.next();
                ob[i]=new transportvehicles(v,s,p); 
                System.out.println(ob[i]);
            }
            if (ch==2)
            {
                System.out.println("ENTER OWNER NAME-->"); 
                String oo=o.next();
                System.out.println("ENTER OWNER ADDRESS-->");
                String ad=o.next();
                ob[i]=new privatevehicles(oo,ad); 
                System.out.println(ob[i]);
            }
        }
    }
}
abstract class car
{
    String reg_no; 
    String model; 
    String reg_date;
}
class transportvehicles extends car
{
    int validity_no;
    String start_date; 
    String period;
    transportvehicles(int n,String m,String d)
    {
        validity_no=n; 
        start_date=m; 
        period=d; 
        reg_no="9131";
        model="9ACD890"; 
        reg_date="12/09/2021";
    }
    public String toString()
   {
       return "VALIDITY NUMBER-->"+validity_no+"\nSTART DATE1-->"+start_date+"\nPERIOD-->"+period+"\nREGISTRATION NUMBER-->"+reg_no+"\nMODEL-->"+model+"\nREGISTRATION DATE-->"+reg_date;
   }
}
class privatevehicles extends car
{
    String owner_name; 
    String owner_address;
    privatevehicles(String na,String ad)
    {
        owner_name=na;
        owner_address=ad;
    }
    public String toString()
    {
        return "OWNER NAME-->\n"+owner_name+"OWNER ADDRESS-->\n"+owner_address;
    }
}

