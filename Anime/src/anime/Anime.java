import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Anime extends JFrame{
 Thread animate;                           //Store ref to animation thread
 ImageIcon images[] = 
 {                                          //An array of images
 new ImageIcon("run-1.png"),
 new ImageIcon("run-2.png"),
 new ImageIcon("run-3.png"),
 new ImageIcon("run-4.png"),
 new ImageIcon("run-5.png"),
 new ImageIcon("run-6.png"),
 new ImageIcon("run-7.png"),
 new ImageIcon("run-8.png"),
 };
 JLabel label = new JLabel(images[0]);
 public Anime(){                                  //constructor
 getContentPane().add(label);
 getContentPane().addMouseListener(               //Use an anonymous inner class to register a mouse listener
 new MouseAdapter(){
 public void mouseEntered(MouseEvent e){
 animate = new Animation();                         //Get a new animation thread and start the animation on it.
 animate.start();
 }                                                 //end mouseEntered
 public void mouseExited(MouseEvent e){
                                                    //Terminate the animation.
 animate.interrupt();
                                                    //Let the thread die a natural death.
                                                      // Then make it eligible for garbage collection.
 while (animate.isAlive()){}                          //loop;
 animate = null;
                                                    //Restore default image.
 label.setIcon(images[0]);
 label.repaint();
 }                                                   //end MouseExited
 }                                                   //end new MouseAdapter
 );                                                  //end addMouseListener()
                                                      //End definition of anonymous inner class
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setTitle("MINI PROJECT GROUP 2");
 setSize(250,200);
 setVisible(true);
 }                                                  //end constructor
 public static void main(String[] args){
 new Anime();
 }                                                   //end main
                                                      //Ordinary inner class to animate the image
 class Animation extends Thread{
 public void run(){                                      //begin run method
 try{
                                                   //The following code will continue to loop until the animation thread is interrupted by the mouseExitedmethod.
 while(true){
                                                    //Display several images in succession.
 display(1,500);
 display(0,500);
 display(2,500);
 display(0,500);
 }                                                              //end while loop
 }catch(Exception ex){
 if(ex instanceof InterruptedException){
                                                    //Do nothing. This exception is expected on mouseExited.
 }else{                                              //Unexpected exception occurred.
 System.out.println(ex);
 System.exit(1);                                     //terminate program
 }
 }
 }
                                    //This method displays an image and sleeps for a prescribed period of time.It terminates and throws an InterruptedException when interrupted by the mouseExited method.
 void display(int image,int delay)
 throws InterruptedException{
                                                  //Select and display an image.
 label.setIcon(images[image]);
 label.repaint();
                                           //Check interrupt status. If interrupted while not asleep, force animation to terminate.
 if(Thread.currentThread().interrupted())
 throw(new InterruptedException());              //Delay specified number of msec. Terminate animation automatically if interrupted while asleep.
 Thread.currentThread().sleep(delay);
 }
 }
}