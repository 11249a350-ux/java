/*A350
AIM:To write a Java Applet program to draw a human face using Graphics class.*/
/*ALGORITHM:
/* 1. Import the required Java packages.
   2. Create a class named face extending Applet.
   3. Override the paint() method.
   4. Use drawOval() to draw the face, eyes and ears.
   5. Use fillOval() to draw the pupils.
   6. Use fillArc() to draw the nose and mouth.
   7. Execute the applet to display the face. 
PROGRAM:*/
import java.awt.*;
import java.io.*;
import java.applet.*;
public class face extends Applet
{
 public void paint(Graphics g)
    {
        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30, 20);

        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 10, 10);

        g.fillArc(85, 100, 30, 30, 0, 180);
        g.fillArc(60, 125, 80, 40, 180, 180);

        g.drawOval(25, 92, 15, 30);
        g.drawOval(160, 92, 15, 30);
    }
}
/* OUTPUT:A human face is displayed with two eyes,
   pupils, nose, mouth and two ears. */
/*RESULT: Thus, the Java Applet program to draw a
   human face using Graphics class was
   successfully executed. */
