
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
class button extends Frame
{
button()
{
TextField objTextf;
setTitle("press the button");
setSize(300,300);
show();
}
public static void main(String[] args)
{

Frame objFrame;
Button objbutton1;
Button objbutton2;
Button objbutton3;
objFrame = new button();
objbutton1 = new Button("hello");
objbutton2 = new Button("Hola");
objbutton3 = new Button("Guten Tag");
objTextf = new TextField("trial");
objbutton1.setBounds(180,150,80,50);
objbutton2.setBounds(100,150,80,50);
objbutton3.setBounds(20,150,80,50);
objFrame.add(objbutton1);
objFrame.add(objbutton2);
objFrame.add(objbutton3);
objFrame.add(objTextf);
objbutton1.addActionListener(new button1Listener());
objbutton2.addActionListener(new button2Listener());
objbutton3.addActionListener(new button3Listener());
}
public class button1Listener
{
public void buttonpushed(ButtonEvent me)
{
String S = objTextf.getText();
objTextf.setText(S);
}
} 
}