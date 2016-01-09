import javax.swing.*;
import java.awt.event.*;

class Latihan96 extends JFrame
{
	// Deklarasi Label	
	JLabel labelL_Sin=new JLabel("SIN      : 12111075");
	JLabel labelL_Name=new JLabel("Nama : Putra Sudaryanto");
	JLabel labelby_Judul=new JLabel("E-Learning (Identity)");
	JLabel labelFieldby_SIN=new JLabel("SIN");
	JLabel labelFieldby_Name=new JLabel("Name ");
	JLabel labelFieldby_Addres=new JLabel("Addres ");
	JLabel labelFieldby_Gender= new JLabel("Gender ");
	JLabel labelFieldby_Religion=new JLabel("Religion");
	JLabel labelFieldby_Hobby=new JLabel("Hobby");
	JLabel labelFieldby_Email=new JLabel("E-Mail ");
	JLabel labelFieldby_Facebook=new JLabel("Facebook ");
	JLabel labelFieldby_Phone=new JLabel("Phone");
	JTextArea txt_area=new JTextArea();
	
	// Text Field
	JTextField by_SIN=new JTextField(30);
	JTextField by_Name=new JTextField(30);
	JTextField by_Addres=new JTextField(30);
	JTextField by_Email=new JTextField(30);
	JTextField by_Facebook=new JTextField(30);
	JTextField by_Phone=new JTextField(30);
	
	// Deklarsi Radio Button
	JRadioButton radio1=new JRadioButton("Female");
	JRadioButton radio2=new JRadioButton("Male");
	
	ButtonGroup RadioGroup=new ButtonGroup();
	
	// Combo box
	String[] by_Religion ={"Islam","Kristen","Budha","Hindu","Katholik"};
	JComboBox comboby_Religion=new JComboBox(by_Religion);
	
	// CheckBox
    JLabel labelby_Hobby=new JLabel("Hobby");
    JCheckBox Watching_TV=new JCheckBox("Watching_TV");
    JCheckBox sleeping=new JCheckBox("sleeping");
	
	// Deklarasi Tombol
	JButton B_Save = new JButton("Save");
	JButton B_exit = new JButton("Exit");
	
	Latihan96() {
		setTitle("Form Biodata");
		setLocation(30,40);
		setSize(450,720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		// Label
		getContentPane().add(labelL_Sin);
		labelL_Sin.setBounds(20,20,130,20);
		
		getContentPane().add(labelL_Name);
		labelL_Name.setBounds(20,40,200,20);
		
		getContentPane().add(labelby_Judul);
		labelby_Judul.setBounds(100,75,190,20);
		
		getContentPane().add(labelFieldby_SIN);
		labelFieldby_SIN.setBounds(20,120,130,20);
		
		getContentPane().add(labelFieldby_Name);
		labelFieldby_Name.setBounds(20,150,130,20);
		
		getContentPane().add(labelFieldby_Addres);
		labelFieldby_Addres.setBounds(20,180,100,20);
		
		getContentPane().add(labelFieldby_Gender);
		labelFieldby_Gender.setBounds(20,210,130,20);
		
		getContentPane().add(labelFieldby_Religion);
		labelFieldby_Religion.setBounds(20,250,130,20);
		
		getContentPane().add(labelFieldby_Hobby);
		labelFieldby_Hobby.setBounds(20,300,130,20);
		
		getContentPane().add(labelFieldby_Email);
		labelFieldby_Email.setBounds(20,370,200,25);
		
		getContentPane().add(labelFieldby_Facebook);
		labelFieldby_Facebook.setBounds(20,400,200,25);
		
		getContentPane().add(labelFieldby_Phone);
		labelFieldby_Phone.setBounds(20,430,150,25);
		
		// Text Field
		getContentPane().add (by_SIN);
		by_SIN.setBounds(100,120,130,25);
		
		getContentPane().add (by_Name);
		by_Name.setBounds(100,150,130,25);
		
		getContentPane().add (by_Addres);
	    by_Addres.setBounds(100,180,250,25);
		
		getContentPane().add (by_Email);
		by_Email.setBounds(100,370,200,25);
		
		getContentPane().add (by_Facebook);
		by_Facebook.setBounds(100,400,200,25);
		
		getContentPane().add (by_Phone);
		by_Phone.setBounds(100,430,150,25);
		
		// Radio Buuton
		getContentPane().add(radio1);
		radio1.setBounds(190,210,80,25);
		getContentPane().add(radio2);
		radio2.setBounds(100,210,80,25);
		RadioGroup.add(radio1);
		RadioGroup.add(radio2);
		
		// Combo box
		getContentPane().add(comboby_Religion);
		comboby_Religion.setBounds(100,250,130,25);
		
		// Check box
		getContentPane().setLayout(null);
        getContentPane().add(Watching_TV);
        Watching_TV.setBounds(100,300,130,20);
        getContentPane().add(sleeping);
        sleeping.setBounds(100,330,100,20);
		
		// Button
		getContentPane().setLayout(null);
		getContentPane().add(B_Save);
		getContentPane().add(B_exit);
		B_Save.setBounds(20,470,75,20);
		B_exit.setBounds(20,500,70,20);
		setVisible(true);
		//txt_area
		getContentPane().add(txt_area);txt_area.setBounds(110,470,300,150);
		setVisible(true);
	}
	
	void orders() {		
		B_Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                //Nim
				txt_area.append(by_SIN.getText()+"\n");

				//Nama
				txt_area.append(by_Name.getText()+"\n");
				
				//Addres
				txt_area.append(by_Addres.getText()+"\n");
				
				//gender
				if(radio1.isSelected()==true)
					txt_area.append(radio1.getText()+"\n");
				else
					txt_area.append(radio2.getText()+"\n");			
				
				//Hobby
				if(Watching_TV.isSelected()==true)
					txt_area.append(Watching_TV.getText()+"\n");
				if(sleeping.isSelected()==true)
					txt_area.append(sleeping.getText()+"\n");
				
                //E-mail
				txt_area.append(by_Email.getText()+"\n");
                
                //Facebook
				txt_area.append(by_Facebook.getText()+"\n");
				
				//Phone
				txt_area.append(by_Phone.getText()+"\n");
			}
		});
		
		B_exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});

	}
	
	public static void main(String []args) {
		Latihan96 inputan=new Latihan96();
		inputan.GUI();
		inputan.orders();
	}
}
