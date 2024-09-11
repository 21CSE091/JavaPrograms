/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt4;

/**
 *
 * @author sweth
 */
public class ex4no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectangle obj=new rectangle();
        System.out.println("Rectangle");
        obj.getarea();
        obj.getperimeter();
        obj.resize(5);
        System.out.println("After resizing by 5");
        obj.getarea();
        obj.getperimeter();
        circle ob=new circle();
        System.out.println("Circle");
        ob.getarea();
        ob.getperimeter();
        ob.resize(10);
        System.out.println("After resizing by 10");
        ob.getarea();
        ob.getperimeter();
    }
   
}
interface resizable
{
    public void resize(int x);
}
class rectangle implements resizable
{
  int length=10;
  int breadth=5;
  @Override
  public void resize(int x)
  {
    length=x;
    breadth=x;
  }
   public void getarea()
    {
     System.out.println("Area = "+length*breadth);
    }
   public void getperimeter()
   {
     System.out.println("Perimeter = "+(2*(length+breadth)));  
   }
  }
class circle implements resizable
{
  int radius=5;
  @Override
  public void resize(int x)
  {
    radius=x;  
  }
  public void getarea()
  {
       System.out.println("Area = "+(3.14*(radius*radius)));
  }
  public void getperimeter()
  {
       System.out.println("Perimeter = "+(2*3.14*radius));
  }
}


