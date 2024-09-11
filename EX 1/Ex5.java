import java.util.Scanner;
public class Ex5
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int m1,m2,m3,m4,m5;
m1=obj.nextInt();
m2=obj.nextInt();
m3=obj.nextInt();
m4=obj.nextInt();     
m5=obj.nextInt();
int sum=m1+m2+m3+m4+m5;
int avg=sum/5;
switch(avg)
{
case 10:
System.out.println("excellent");
break;
case 9:
System.out.println("very good");
break;
case 8:
System.out.println("very good");
break;
case 7:
System.out.println("good");
break;
case 6:
System.out.println("good");
break;
case 5:
System.out.println("poor");
break;
case 4:
System.out.println("poor");
break;
case 3:
System.out.println("poor");
break;
case 2:
System.out.println("very poor");
break;
case 1:
System.out.println("very poor");
break;
default:
System.out.println("invalid");
break;
}
}
}
