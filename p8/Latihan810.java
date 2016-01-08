import javax.swing.*;

class Latihan810 extends JFrame {
	String [] contoh = {"combo box1","combo box2","combo box3"};
	JComboBox combocontoh = new JComboBox (contoh) ; 
	
	Latihan810 () {
		setTitle ("combo box") ;
		setLocation (300,100);
		setSize (240, 120);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(combocontoh);
		combocontoh.setBounds(10,10,120,20);
		setVisible (true);
	}

	public static void main (String[]args) {
		Latihan810 sq = new Latihan810 ();
		sq.GUI();
	}
}
