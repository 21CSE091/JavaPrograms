/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt3;
import java.util.Scanner;
/**
 *
 * @author sweth
 */
public class Expt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("student");
        student obj;
        obj = new student("swetha","madurai","java",2022,70000);
        System.out.println("name: "+obj.getname());
        System.out.println("address: "+obj.getaddress());
        System.out.println("program: "+obj.getprogram());
        Scanner ob=new Scanner(System.in);
        System.out.println("enter program to be changed");
        String pgm=ob.next();
        obj.setprogram(pgm);
        System.out.println("year: "+obj.getyear());
        System.out.println("enter year to be changed");
        int yar=ob.nextInt();
        obj.setyear(yar);
        System.out.println("fees: "+obj.getfee());
        System.out.println("enter fee to be changed");
        double f=ob.nextDouble();
        obj.setfee(f);
        System.out.println(obj.toString());
        System.out.println("staff");
        staff o=new staff("geetha","madurai","vcet",80000);
        System.out.println("name: "+o.getname());
        System.out.println("address: "+o.getaddress());
        System.out.println("school: "+o.getschool());
        System.out.println("enter school to be changed");
        String schl=ob.next();
        o.setschool(schl);
        System.out.println("pay: "+o.getpay());
        System.out.println("enter pay to be changed");
        double p=ob.nextDouble();
        o.setpay(p);
        System.out.println(o.toString()); 
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
    void setaddress(String add)
    {
        address=add;
    }
    @Override
    public String toString()
    {
        return "name="+name+" "+"address="+address;
    }
}
class student extends person
{
    int year;
    String program;
    double fee;
   student(String n,String a,String pgm,int yar,double f)
   {
       super(n,a);
    year=yar;
    
    program=pgm;
    fee=f;
    
   }
   String getprogram()
   {
       return program;
   }
   void setprogram(String pgm)
   {
       program=pgm;
   }
   int getyear()
   {
       return year;
   }
   void setyear(int yar)
   {
       year=yar;
   }
   double getfee()
   {
       return fee;
   }
   void setfee(double f)
   {
       fee=f;
   }
    @Override
   public String toString()
   {
     return "name="+name+" "+"address="+address+" "+"program="+program+" "+"year="+year+" "+"fee"+fee;  
   }
}
class staff extends person
{
    String school;
    double pay;
    staff(String n,String a,String schl,double p)
    {
        super(n,a);
        school=schl;
        pay=p;
    }
    String getschool()
    {
        return school;
    }
    void setschool(String sch)
    {
        school=sch;
    }
    double getpay()
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
        return "name="+name+" "+"address="+address+" "+"school="+school+" "+"pay="+pay;
    }
}