import java.awt.FlowLayout;
import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DontExtendJFrame implements ActionListener {

  private enum Actions {
    MOO,
    GOODBYE,
    RIBBIT
  }

  public static void main(String[] args) {

    DontExtendJFrame instance = new DontExtendJFrame();

    JFrame frame = new JFrame("Test");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 100);

    JButton hello = new JButton("Hello");
    hello.setActionCommand(Actions.MOO.name());
    hello.addActionListener(instance);
    frame.add(hello);

    JButton goodbye = new JButton("Goodbye");
    goodbye.setActionCommand(Actions.GOODBYE.name());
    goodbye.addActionListener(instance);
    frame.add(goodbye);

    JButton goodbye1 = new JButton("Goodbye1");
    goodbye.setActionCommand(Actions.RIBBIT.name());
    goodbye.addActionListener(instance);
    frame.add(goodbye1);

    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent evt) {
    if (evt.getActionCommand() == Actions.HELLO.name()) {
      JOptionPane.showMessageDialog(null, "Hello");
    }else if (evt.getActionCommand() == Actions.GOODBYE.name()) {
      JOptionPane.showMessageDialog(null, "Helfw");
    }if (evt.getActionCommand() == Actions.RIBBIT.name()) {
      JOptionPane.showMessageDialog(null, "Hello123");
    }
  }
}
