/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secondoccurrence;
/**
 *
 * @author sweth
 */
public class secondoccurrence {
 static char second(String str) {
  int[] a= new int[256];
  int i;
  for (i=0;i<str.length();i++){
   (a[str.charAt(i)]) ++;
  }
  int first=0;
  int second =0;
  for (i=0;i<256;i++) {
   if (a[i] > a[first]) {
    second=first;
    first=i;
   }
   else if (a[i]>a[second] && a[i]!=a[first]){
    second=i;
  }
  }
  return (char)second;
 }
 public static void main(String args[]) {
  String str = "aaaabbbccd";
  char s=second(str);
  System.out.println("The second most frequent letter is" +s);
 }
}