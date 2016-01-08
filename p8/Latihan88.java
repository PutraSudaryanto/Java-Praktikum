import javax.swing.*;

class Latihan88 extends JFrame {
	JRadioButton radiocontoh1 = new JRadioButton ("Radio 1");	
	JRadioButton radiocontoh2 = new JRadioButton ("Radio 2");
	ButtonGroup groupContoh = new ButtonGroup();
	
	Latihan88 () {
		setTitle ("radio button") ;
		setLocation (300,100);
		setSize (240, 120);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		getContentPane().setLayout(null);
		getContentPane().add(radiocontoh1);
		radiocontoh1.setBounds(10,10,80,20);
		getContentPane().add (radiocontoh2);
		radiocontoh2.setBounds(10,30,80,20);
		groupContoh.add(radiocontoh1);
		groupContoh.add (radiocontoh2);
		setVisible (true);
	}

	public static void main (String[]args) {
		Latihan88 sq = new Latihan88 ();
		sq.GUI();
	}
}
