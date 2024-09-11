/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expt12;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sweth
 */
public class generic {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int x;
        int z;
        boolean y=true;
        while(y)
        {
            System.out.println("Select the operation:\n1.Enter element at first\n2.Enter element at middle\n3.Enter element at last\n4.Delete specific index\n5.Display the array\n6.Exit");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    list.add(0, z);
                    break;
                case 2:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    int s=list.size()/2;
                    list.add(s, z);
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    list.add(z);
                    break;
                case 4:
                    System.out.println("Enter the index of element:");
                    z=sc.nextInt();
                    list.remove(z+1);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    y=false;
                    break;
                default:
                    System.out.println("Wrong operation!!!");
                    break;
            }
        }
    }   
}
   