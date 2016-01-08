import java.awt.*;

public class Latihan83 extends Frame {

	String nmFILE = "putra.png";
	Image gb = Toolkit.getDefaultToolkit().getImage(nmFILE);

	public void paint (Graphics g) {
		setTitle ("contoh image");
		g.setColor(Color.blue);
		g.drawString ("Welcome !",105,250);
		g.drawImage(gb,30,30,this);
	}
	
	public boolean handleEvent (Event evt) {
		if (evt.id == Event.WINDOW_DESTROY) System.exit(0);
		return false;
	}
	
	public static void main(String args[]) {
		Frame f = new Latihan83();
		f.resize(300,300);
		f.show();
	}
}
