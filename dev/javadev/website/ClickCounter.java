import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame; //importing awt
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickCounter {

  public static void main(String[] args) {

    Frame frame = new Frame("HOW MANY TIMES CAN YOU CLICK???");

    final TextArea textArea = new TextArea("My highscore is 8. What's yours?");
    final TextArea textArea1 = new TextArea("Test");
    Component button = new Button("GOTTA GO FAST");

    button.addMouseListener(new MouseAdapter() { //this is what is counting the mouse clicks

  public void mouseClicked(MouseEvent evt) {

    if (evt.getClickCount() == 1) {

textArea.setText("1 click! "); //these are the messages for the mouse clicks...they go up to 16. 

    } else if (evt.getClickCount() == 2) {

textArea.setText("2 clicks!");
    } else if (evt.getClickCount() == 3) {

textArea.setText("3 clicks!");
    } else if (evt.getClickCount() == 4) {

textArea.setText("4 clicks!");

    } else if (evt.getClickCount() == 5) {

textArea.setText("5 clicks!");

    } else if (evt.getClickCount() == 6) {

textArea.setText("6 clicks!");

    } else if (evt.getClickCount() == 7) {

textArea.setText("7 clicks!");

    } else if (evt.getClickCount() == 8) {

textArea.setText("8 clicks!");

    } else if (evt.getClickCount() == 9) {

textArea.setText("9 clicks!");
    } else if (evt.getClickCount() == 9) {

textArea.setText("9 clicks!");

textArea.setText("10 clicks!");
    } else if (evt.getClickCount() == 10) {

textArea.setText("11 clicks!");

    } else if (evt.getClickCount() == 11) {

textArea.setText("12 clicks!");

    } else if (evt.getClickCount() == 12) {

textArea.setText("13 clicks!");

    } else if (evt.getClickCount() == 13) {

textArea.setText("14 clicks!");

    } else if (evt.getClickCount() == 14) {

textArea.setText("15 clicks! Nice!");



    }

  }
    });

    frame.add(textArea, BorderLayout.NORTH); //researched some borders!!
    frame.add(button, BorderLayout.SOUTH);

    int width = 300; //made the frame decently big so the user can actually see the button/number of clicks.
    int height = 300;
    frame.setSize(width, height);
    frame.setVisible(true);

  }

}