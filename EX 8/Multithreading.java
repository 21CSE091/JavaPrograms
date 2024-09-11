/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author sweth
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        thr1 s1=new thr1();
        s1.start();
        thr2 s2=new thr2();
        s2.start();
        thr3 s3=new thr3();
        s3.start();
    }
}
class thr1 extends Thread{
   public void run()
   {
       System.out.println("1");
       try {
           Thread.sleep(5);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("4");
     try {
           Thread.sleep(8);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("7");
}
}
class thr2 extends Thread{
   public void run()
   {
       System.out.println("2");
       try {
           Thread.sleep(6);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("5");
     try {
           Thread.sleep(9);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     
     System.out.println("8");
}
}
class thr3 extends Thread{
   public void run()
   {
       System.out.println("3");
       try {
           Thread.sleep(7);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("6");
     try {
           Thread.sleep(10);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
    try {
           Thread.sleep(10);
       } catch (InterruptedException e) {
           System.out.println(e);
       }
     System.out.println("9");
}
}