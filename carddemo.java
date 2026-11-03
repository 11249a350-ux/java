/*A350
AIM:To create a Java Applet using CardLayout and switch between buttons when clicked. 
ALGORITHM:
   1. Import the required packages.
   2. Create a class extending Applet.
   3. Create a Panel and CardLayout.
   4. Create three buttons.
   5. Add buttons to the panel.
   6. Set CardLayout as the layout manager.
   7. Use ActionListener to handle button clicks.
   8. Use next() method to display the next button. 
PROGRAM*/
import java.io.*; import
java.awt.*; import
java.applet.*;
import java.awt.event.*;
<applet code="carddemo" width=250 height=150>
</applet>
public class carddemo extends Applet implements ActionListener
{
Button b1,b2,b3,b4; Panel
buttonPanel;
CardLayout buttonCardLayout;
public void init()
{
buttonPanel=new Panel();
add(buttonPanel);
buttonCardLayout=new CardLayout();
buttonPanel.setLayout(buttonCardLayout);
b1=new Button("first Button");
b1.addActionListener(this);
buttonPanel.add(b1,"first Button");
b2=new Button("second Button");
b2.addActionListener(this);
buttonPanel.add(b2,"second Button");
b3=new Button("third button");
b3.addActionListener(this);
buttonPanel.add(b3,"third Button");
}
public void actionPerformed(ActionEvent e)
{
buttonCardLayout.next(buttonPanel);
}
}
/*OUTPUT: First Button is displayed initially.
         On clicking, Second Button is displayed.
         On clicking again, Third Button is displayed.
        The cycle repeats from First Button. 
RESULT: Thus, the Java Applet using CardLayout was successfully executed. */
