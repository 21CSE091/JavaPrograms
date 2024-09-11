/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwapartmentexception;

/**
 *
 * @author sweth
 */
public class apartmentexception extends Exception{
    int aptno;
    int bedno;
    int rent;
    String add;
    public apartmentexception(String address,int no,int bed,int r)
    {
        super("apartment");
        add=address;
        bedno=bed;
        rent=r;
        aptno=no;
        System.out.println("apartmentexception");
       
    }
    public apartmentexception()
    {
        super("apartmentexception");
    }
}