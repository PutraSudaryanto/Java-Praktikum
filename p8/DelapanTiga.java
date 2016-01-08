import java.awt.*;

public class DelapanTiga extends Frame {
    String nmFile = "putra.png";
    Image gb = Toolkit.getDefaultToolkit().getImage(nmFile);

    public void paint(Graphics g) {
        setTitle("Contoh Image");
        g.setColor(Color.blue);
        g.drawString("Welcome to", 30, 60);
        g.drawImage(gb,30,30,this);
    }
    
    public boolean handleEvent(Event evt) {
        if(evt.id == Event.WINDOW_DESTROY)
            System.exit(0);
        return false;
    }

    public static void main(String args[]) {
        DelapanTiga f = new DelapanTiga();
        f.resize(400,400);
        f.show();
    }
}
