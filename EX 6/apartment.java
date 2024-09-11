/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package throwapartmentexception;

/**
 *
 * @author sweth
 */
public class apartment {
    public apartment(String address, int no, int bed, int rent) {
        try{
        if((no<3) && (bed>1&&bed<4) && (rent<2500&&rent>500))
        {
            System.out.println("successful");
        }
        else
        {
            System.out.println("the error occured is");
            throw(new apartmentexception());
        }
        }
        catch(apartmentexception e)
        {
            System.out.println(e.getMessage());
        }
    }     
}
