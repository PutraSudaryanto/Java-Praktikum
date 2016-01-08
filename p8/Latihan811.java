import javax.swing.*;

class Latihan811 extends JFrame {
	JButton buttoncontoh = new JButton ("button");	 
	
	Latihan811 () {
		setTitle ("button") ;
		setLocation (300,100);
		setSize (240, 120);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(buttoncontoh);
		buttoncontoh.setBounds(10,10,80,20);
		setVisible (true);
	}

	public static void main (String[]args) {
		Latihan811 sq = new Latihan811 ();
		sq.GUI();
	}
}
