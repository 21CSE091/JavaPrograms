/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt4;

import java.util.Scanner;

/**
 *
 * @author sweth
 */
public class ex4n01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("enter measurements");
        int measurement1=o.nextInt();
        System.out.println("enter mesaurements");
        int measurement2=o.nextInt();
        rectangle obj=new rectangle(4,measurement1,measurement2);
        triangle ob=new triangle(3,measurement1,measurement2);
        System.out.println("rectangle");
        System.out.println("no.of sides.."+obj.getmethod());
        obj.getarea();
        obj.getperimeter();
        System.out.println("triangle");
        System.out.println("no.of sides"+ob.getmethod());
        ob.getarea();
        ob.getperimeter();
    }
   
}
abstract class shape
{
    int numsides;
    shape(int n)
    {
        numsides=n;
    }
    int getmethod()
    {
        return numsides;
    }
   
    abstract void getarea();
    abstract void getperimeter();
}
class rectangle extends shape
{
   int length;
   int breadth;
 
           rectangle(int n,int w,int h)
           {
               super(n);
               length=w;
               breadth=h;
           }
            @Override
   void getarea()
   {
     System.out.println("area..."+length*breadth);
   }
   @Override
   void getperimeter()
   {
       System.out.println("perimeter..."+2*(length+breadth));
   }
}
class triangle extends shape
{
    int base;
    int height;
    triangle(int n,int w,int h)
    {
        super(n);
        base=w;
        height=h;
    }
    @Override
    void getarea()
    {
      System.out.println("area..."+(base*height)/2);  
    }
    @Override
    void getperimeter()
    {
        System.out.println("perimeter..."+(base+height+numsides));
    }
}


