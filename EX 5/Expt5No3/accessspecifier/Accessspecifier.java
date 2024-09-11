/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accessspecifier;
import subpackage.pack2;
/**
 *
 * @author sweth
 */
class accessspecifier extends pack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        accessspecifier obj=new accessspecifier();
        obj.display1();
        try{
            obj.display2();
        }
        catch(Exception e){
            System.out.println("defualt cannot be displayed");
        }
    }
}
