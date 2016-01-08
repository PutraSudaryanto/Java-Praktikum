import javax.swing.*;
class Latihan86 extends JFrame {
	JLabel labelcontoh = new JLabel ("Label");	
	
	Latihan86 () {
		setTitle ("label") ;
		setLocation (300,100);
		setSize (250, 100);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(labelcontoh);
		labelcontoh.setBounds(10,10,80,20);
		setVisible (true);
	}

	public static void main (String[]args) {
		Latihan86 sq = new Latihan86 ();
		sq.GUI();
	}
}
