import javax.swing.*;
import java.awt.event.*;

class Latihan92 extends JFrame
{
	JLabel labelGender=new JLabel("Gender");	
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	ButtonGroup gender = new ButtonGroup();	
	JTextArea areaText=new JTextArea();
	JButton buttonSave = new JButton("Save");
	JButton buttonExit = new JButton("Exit");
	
	Latihan92() {
		setTitle("Form Gender");
		setLocation(30,40);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		JPanel prop = new JPanel();
      	prop.setLayout(null);
		
		prop.add(labelGender).setBounds(10, 20, 100, 25);
      	prop.add(male).setBounds(100, 20, 70, 25);
      	prop.add(female).setBounds(180, 20, 70, 25);
      	gender.add(male);
      	gender.add(female);
		
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
				if(male.isSelected() != true && female.isSelected() != true) {
					areaText.append("gender cannot be blank\n");
				} else {
					if(male.isSelected() == true){
						areaText.append(male.getText()+"\n");
					} else {
						areaText.append(female.getText()+"\n");
					}					
				}
			}
		});
		
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});		
	}
	
	public static void main(String []args) {
		Latihan92 i = new Latihan92();
		i.GUI();
		i.event();
	}
}
