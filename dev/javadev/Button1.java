import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 extends JApplet {

private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2"), b3 = new JButton("Button 3");
	


b2.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    // display/center the jdialog when the button is pressed
    JDialog d = new JDialog(frame, "Hello", true);
    d.setLocationRelativeTo(frame);
    d.setVisible(true);
  }
});



  public void init() {
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    cp.add(b1);
    cp.add(b2);
    cp.add(b3);


  }


  public static void main(String[] args) {
    run(new Button1(), 200, 50);
  }

  public static void run(JApplet applet, int width, int height) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(applet);
    frame.setSize(width, height);
    applet.init();
    applet.start();
    frame.setVisible(true);
  }
} ///:~
