import javax.swing.*;

class Latihan87 extends JFrame {
	JTextField textcontoh = new JTextField (35);	
	
	Latihan87 () {
		setTitle ("text field") ;
		setLocation (300,100);
		setSize (240, 120);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(textcontoh);
		textcontoh.setBounds(10,10,150,20);
		setVisible (true);
	}

	public static void main (String[]args) {
		Latihan87 sq = new Latihan87 ();
		sq.GUI();
	}
}
