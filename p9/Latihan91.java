import javax.swing.*;
import java.awt.event.*;

class Latihan91 extends JFrame
{
	JLabel labelName=new JLabel("Nama");
	JTextField fieldName=new JTextField(30);
	JTextArea areaText=new JTextArea();
	JButton buttonSave = new JButton("Save");
	JButton buttonExit = new JButton("Exit");
	
	Latihan91() {
		setTitle("Form Nama");
		setLocation(30,40);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		JPanel prop = new JPanel();
      	prop.setLayout(null);
		
		prop.add(labelName).setBounds(10, 20, 100, 25);
		prop.add(fieldName).setBounds(100, 20, 150, 25);
		prop.add(areaText).setBounds(100, 50, 150, 25);
		
      	prop.add(buttonSave).setBounds(10,50,75,20);
		prop.add(buttonExit).setBounds(10,80,75,20);
		
      	this.setContentPane(prop);
		setVisible(true);
	}
	
	public void event() {
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaText.setText("");
				areaText.append(fieldName.getText());
			}
		});
		
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});		
	}
	
	public static void main(String []args) {
		Latihan91 i = new Latihan91();
		i.GUI();
		i.event();
	}
}
