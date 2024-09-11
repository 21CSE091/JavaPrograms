/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counts;

/**
 *
 * @author sweth
 */
public class Counts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="i-like-java-programming,do you?";
        char c[]=s.toCharArray();
        int count=0;
        for(char a:c)
        {
            if(a=='-'||a==','||a=='?'||a==' '||a=='.'||a==';'||a=='!')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

