import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseDemo extends Applet implements MouseListener {  
  boolean mouseIn,clicked;
  public static int count=0;
  int mycount;

  public void init() {
    mouseIn=false;
    clicked=false;
    addMouseListener(this);
    mycount=++count;
    repaint();
  }
   
  public void paint(Graphics g) {
    setBackground((mouseIn^clicked)?Color.red:Color.blue);
    g.setColor(Color.white);
    g.drawString(""+mycount,20,20);  
  }

  public void mousePressed(MouseEvent e) {  
    clicked=!clicked;
    repaint();
  }

  public void mouseReleased(MouseEvent e) {}

  public void mouseEntered(MouseEvent e) {
    mouseIn=true;
    repaint();
  }

  public void mouseExited(MouseEvent e) {
    mouseIn=false;
    repaint();
  }

  public void mouseClicked(MouseEvent e) {}
}