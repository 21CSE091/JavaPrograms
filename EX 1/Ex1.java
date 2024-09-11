import java.io.*;
import java.util.*;
public class Ex1
{
	public static void main(String[] args)
        {
	    Scanner in=new Scanner(System.in);
            System.out.println("Enter the no.of days");
            int n=in.nextInt();
	    int month=n/30;
	    int day=n%30;
		System.out.println("Month:"+month+" "+"Days:"+day);
	}
}
