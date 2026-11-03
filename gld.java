/*A350
AIM:
To write a Java Applet program to display ten buttons
using GridLayout (5 rows and 2 columns).
ALGORITHM:
1. Import the required AWT and Applet packages.
2. Create a class named gld that extends Applet.
3. Override the init() method.
4. Set the layout to GridLayout(5,2).
5. Create ten buttons with labels A to J.
6. Add all ten buttons to the applet.
7. Override getInsets() to provide a 20-pixel margin.
8. Execute the applet to display the buttons.
PROGRAM:*/
import java.awt.*;
import java.io.*;
import java.applet.Applet.*;
import java.applet.*;
<applet code="gld.class" height=300 width=300>
</applet>

public class gld extends Applet
{
public void init()
{ 
setLayout(new GridLayout(5,2));
Button b1=new Button("A");
Button b2=new Button("B");
Button b3=new Button("C");
Button b4=new Button("D");
Button b5=new Button("E");
Button b6=new Button("F");
Button b7=new Button("G");
Button b8=new Button("H");
Button b9=new Button("I");
Button b10=new Button("J");
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
}
public Insets getInsets()
{
return new Insets(20,20,20,20);
}}
/*OUTPUT:
An applet window containing ten buttons arranged
in 5 rows and 2 columns.

A   B
C   D
E   F
G   H
I   J

RESULT:
Thus, the Java Applet program to display ten buttons
using GridLayout was successfully executed.
*/
