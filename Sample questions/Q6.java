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
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student obj=new student("Hari","Abc","CSE",2022,51000.00); 
        System.out.println(obj.getname()); 
        System.out.println(obj.getaddress()); 
        System.out.println(obj.getprogram()); 
        System.out.println(obj.getyear()); 
        System.out.println((obj.getfee()));
        Scanner obj1=new Scanner(System.in); 
        System.out.println("Enter the address to be changed:"); 
        String ad1=obj1.next();
        obj.setaddress(ad1);
        System.out.println("Enter program name to be changed"); 
        String program1=obj1.next();
        obj.setprogram(program1);
        System.out.println("Enter a year to be changed:"); 
        int year1=obj1.nextInt();
        obj.setyear(year1);
        System.out.println("Enter fees to be changed:"); 
        double fees1=obj1.nextDouble(); 
        obj.getfee(fees1); 
        System.out.println(obj.toString());
        staff obj2=new staff("Heisenberg","Alberqerque","Breaking bad",30000.00); 
        System.out.println(obj2.getname()); 
        System.out.println(obj2.getaddress()); 
        System.out.println(obj2.getschool());
        System.out.println(obj2.pay()); 
        Scanner obj3=new Scanner(System.in);
        System.out.println("Enter a address to be changed:"); 
        String ad2=obj3.next();
        obj2.setaddress(ad2);
        System.out.println("Enter a school to be changed:"); 
        String school1=obj3.next();
        obj2.setschool(school1); 
        System.out.println("Enter pay to be changed:"); 
        double pay1=obj3.nextDouble(); 
        obj2.setpay(pay1); 
        System.out.println(obj2.toString());
    }
}
class person
{
    String name; 
    String address;
    person(String n,String a)
    {
        name=n; 
        address=a;
    }
    String getname()
    {
        return name;
    }
    String getaddress()
    {
        return address;
    }
    void setaddress(String a)
    {
        address=a;
    }
    @Override 
    public String toString()
    {
        return "Name:"+name+"\n"+"Address:"+address;
    }
}
class student extends person
{
    String program; 
    int year;
    double fee;
    student(String n,String a,String p,int y,double f)
    {
        super(n,a); 
        program=p; 
        year=y; 
        fee=f;
    }
    String getprogram()
    {
        return program;
    }
    void setprogram(String p)
    {
        program=p; 
    }
    int getyear()
    {
        return year;
    }
    void setyear(int y)
    {
        year=y;
    }
    double getfee()
    {
        return fee;
    }
    void getfee(double f)
    {
        fee=f;
    }
    @Override
    public String toString()
    {
        return "Name:"+name+"\n"+"Address:"+address+"\n"+"Program:"+program+"\n"+"Year:"+year+"\n"+"Fe e:"+fee;
    } 
}
class staff extends person
{
    String school; 
    double pay;
    staff(String n,String a,String s,double p)
    {
        super(n,a); 
        school=s; 
        pay=p;
    }
    String getschool()
    {
        return school;
    }
    void setschool(String s)
    {
        school=s;
    }
    double pay()
    {
        return pay;
    }
    void setpay(double p) 
    {
        pay=p;
    }
    @Override
    public String toString()
    {
        return "Name:"+name+"\n"+"Address"+address+"\n"+"School:"+school+"\n"+"Pay:"+pay;
    }
}

