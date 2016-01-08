import javax.swing.*;

class Latihan85 extends JFrame {
	Latihan85 () {
		setTitle ("frame") ;
		setLocation (300,100);
		setSize (250, 100);
		//mengaktifkan button close
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		setVisible (true);

	}

	public static void main (String[]args) {
		Latihan85 sq = new Latihan85 ();
	}
}
