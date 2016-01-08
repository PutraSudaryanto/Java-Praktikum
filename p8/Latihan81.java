import java.awt.*;

public class Latihan81 extends Frame {

	public static void main (String args[]) {
		Frame f = new Frame ();
		f.resize (250,150);
		f.show ();
	}
	
	public boolean handleEvent (Event evt) {
		if (evt.id == Event.WINDOW_DESTROY)
		System.exit(0);
		return false;
	}
}
