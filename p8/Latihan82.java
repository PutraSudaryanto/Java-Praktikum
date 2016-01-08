import java.awt.*;

public class Latihan82 extends Frame {

	public Latihan82() {
		setTitle ("contoh font"); //judul windows
	}

	public void paint (Graphics g) {
		g.drawRect (20,40,250,100);
		g.drawString ("Welcome To",30,60);
		g.setFont(new Font("calibry", Font.BOLD,12));
		g.drawString ("Univ. Mercu Buana Yogyakarta",30,90);
	}

	public boolean handleEvent (Event evt) {
		if (evt.id == Event.WINDOW_DESTROY)
		System.exit(0);
		return false;
	}
	
	public static void main(String args[]) {
		Frame f = new Latihan82();
		f.resize(300,180);
		f.show();
	}
}
