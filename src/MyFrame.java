import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton button;
	JLabel label;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		button.setFocusable(false);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setFont(new Font("MV Boli",Font.PLAIN,100));
		label.setText("Just some text");
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		//	JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color !", Color.black);
			
			label.setForeground(color);
		//	label.setBackground(color);
		}
	}
}
