/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oops.lab;
import java.util.*;
/**
 *
 * @author sweth
 */
interface queueoperations
{
    public void enqueue(int b);
    public void dequeue();
    public void display();
    public void peek();
}
class Myqueue implements queueoperations
{
    int i;
    int queue[];
    int arr_size; 
    int rear;
    int front; 
    int data;
    Myqueue(int size)
    {
        arr_size=size; 
        queue=new int[arr_size]; 
        rear=-1;
        front=0;
    }
    public void enqueue(int b)
    {
        data=b; 
        if(rear==arr_size-1)
        {
            System.out.println("overflow");
        }
        else
        {
            rear=rear+1;
            queue[rear]=data;
        }
    }
    public void dequeue()
    {
        if(front==arr_size)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println(queue[front]); 
            front++;
        }
    }
    public void display()
    {
        for(i=front;i<=rear;i++)
        {
            System.out.print("||"+queue[i]+"||-");
        }
    }
    public void peek()
    {
        System.out.println("||"+queue[front]+"||");
    }
}
public class Q5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ch,n,a;
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter your array size"); 
        n=s.nextInt();
        Myqueue obj=new Myqueue(n); 
        do
        {
            System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Display First value\nEnter your choice");
            ch=s.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter your data"); 
                    a=s.nextInt();
                    obj.enqueue(a);
                    obj.display(); 
                    break;
                }
                case 2:
                {
                    obj.dequeue(); 
                    obj.display(); 
                    break;
                }
                case 3:
                {
                    obj.display(); 
                    break;
                }
                case 4:
                {
                    obj.peek(); 
                    break;
                }
                default:
                    System.exit(0);
            }
        }while(ch!=5);
    }
}
