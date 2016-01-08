import javax.swing.*;

class Latihan89 extends JFrame {
	JCheckBox checkcontoh1 = new JCheckBox ("check box 1");	
	JCheckBox checkcontoh2 = new JCheckBox ("check box 2");
	ButtonGroup groupContoh = new ButtonGroup(); 
	JPanel panel1 = new JPanel (); 
	
	Latihan89 () {
		setTitle ("combo box") ;
		setLocation (300,100);
		setSize (240, 120);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(checkcontoh1);
		checkcontoh1.setBounds(10,10,120,20);

		getContentPane().setLayout(null);
		getContentPane().add(checkcontoh2);
		checkcontoh2.setBounds(10,40,120,20);

		groupContoh.add (checkcontoh1) ;
		groupContoh.add (checkcontoh2) ;

		setVisible (true);

	}

	public static void main (String[]args) {
		Latihan89 sq = new Latihan89 ();
		sq.GUI();
	}
}
