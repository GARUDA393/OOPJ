import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.applet.Applet;
public class FirstApplet extends Applet implements ActionListener {
TextField t1 = new TextField(10);
TextField t2 = new TextField(10);
TextField t3 = new TextField(10);
Label l1 = new Label("FIRST NO:");
Label l2 = new Label("SECOND NO:");
Label l3 = new Label("SUM:");
Button b1 = new Button("ADD");
public void init() {
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == b1) {
int n1 = Integer.parseInt(t1.getText());
int n2 = Integer.parseInt(t2.getText());
t3.setText(" " + (n1 + n2));
}
}
}
