/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oops.lab;

/**
 *
 * @author sweth
 */
public class Q17 extends Thread {
    public void run()
    {
        System.out.println("Inside run method");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q17 t1 = new Q17();
        Q17 t2 = new Q17(); 
        Q17 t3 = new Q17();
        System.out.println("t1 thread priority : "+ t1.getPriority());
        System.out.println("t2 thread priority : "+ t2.getPriority());
        System.out.println("t3 thread priority : "+ t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5); 
        t3.setPriority(8);
        System.out.println("t1 thread priority : "+ t1.getPriority());
        System.out.println("t2 thread priority : "+ t2.getPriority());
        System.out.println("t3 thread priority : "+ t3.getPriority());
        System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
        System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}