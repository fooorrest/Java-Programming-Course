import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Counter extends JFrame implements ActionListener
{
private static String txt = "Counter: ";
private int count = 0;
JLabel label;
JButton button;

public Counter()
{
    setTitle("Title");
    setSize(3000,2000);
    label = new JLabel(txt + "0 ");
    button = new JButton("Push!");

    getContentPane().setLayout(new GridLayout(0, 1));
    getContentPane().add(label);
    getContentPane().add(button);
    pack();

    button.setMnemonic(KeyEvent.VK_O);
    button.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
count++;
label.setText(txt + count);
}


public static void main(String[] args)
{
    Counter frame = new Counter();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

} 