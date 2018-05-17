import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JLabel output = new JLabel("A");
	JButton button = new JButton();
public static void main(String[] args) {
	BinaryConverter object = new BinaryConverter();
	object.setup();

}

void setup() {
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(input);
	panel.add(output);
	panel.add(button);
	button.setText("convert");
	button.addActionListener(this);
	frame.pack();
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("fdghj");
	
}

}
