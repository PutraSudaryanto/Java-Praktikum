import java.awt.*;
public class Latihan812 extends Frame{

	public Latihan812() {
		setTitle ("menggambar mobil"); //judul windows
	}

	public void paint (Graphics g) {
		g.fillRect (60,80,60,20);
		g.fillRect (120,40,40,60);
		g.drawRect (160,40,40,60);
		g.fillRect (200,40,40,60); 
		g.drawRect (240,40,40,60);
		g.fillRect (280,40,40,60);
		g.drawRect (320,40,40,60);
		g.drawRect (60,100,60,40);
		g.drawRect (120,100,240,40);
		g.fillOval (70,120,40,40);
		g.fillOval (290,120,40,40);
		g.drawLine (30,160,365,160);
		setBackground (Color.cyan);
	}

	public boolean handleEvent (Event evt) {
		if (evt.id == Event.WINDOW_DESTROY)
		System.exit(0);
		return false;
	}
	public static void main(String args[]) {
		Frame f = new Latihan812();
		f.setLocation (300,80);
		f.resize(420,210);
		f.show();
	}
}
