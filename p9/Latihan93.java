import javax.swing.*;
import java.awt.event.*;

class Latihan93 extends JFrame
{
	JLabel labelClass=new JLabel("Class");	
	JCheckBox morning = new JCheckBox("Morining");
	JCheckBox evening = new JCheckBox("Evening");
	JCheckBox extension = new JCheckBox("Extension");
	JTextArea areaText=new JTextArea();
	JButton buttonSave = new JButton("Save");
	JButton buttonExit = new JButton("Exit");
	
	Latihan93() {
		setTitle("Form Gender");
		setLocation(30,40);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		JPanel prop = new JPanel();
      	prop.setLayout(null);
		
		prop.add(labelClass).setBounds(10, 20, 100, 25);
      	prop.add(morning).setBounds(100, 20, 200, 25);
      	prop.add(evening).setBounds(100, 40, 200, 25);
      	prop.add(extension).setBounds(100, 60, 200, 25);
		
		prop.add(areaText).setBounds(100, 90, 150, 25);
		
      	prop.add(buttonSave).setBounds(10,90,75,20);
		prop.add(buttonExit).setBounds(10,120,75,20);
		
      	this.setContentPane(prop);
		setVisible(true);
	}
	
	public void event() {
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				areaText.setText("");
				if((morning.isSelected() == true) && (evening.isSelected() == true) && (extension.isSelected() == true)){
					areaText.append(morning.getText() +", "+ evening.getText()+", "+ extension.getText()+"\n");
				} 
				else if(morning.isSelected() == true){
					areaText.append(morning.getText()+"\n");
				}
				else if(evening.isSelected() == true){
					areaText.append(evening.getText()+"\n");
				}
				else if(extension.isSelected() == true){
					areaText.append(extension.getText()+"\n");
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
		Latihan93 i = new Latihan93();
		i.GUI();
		i.event();
	}
}
