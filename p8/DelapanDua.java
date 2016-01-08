import java.awt.*;

public class DelapanDua extends Frame {
    public DelapanDua() {
        setTitle("Delapan Dua");
    }
    public void paint(Graphics g) {
        g.drawRect(20,40,250,100);
        g.drawString("Welcome to", 30, 60);
        g.setFont(new Font("Calibry", Font.BOLD, 11));
        g.drawString("Universitas Mercubuana Yogyakarta", 30, 90);
    }
    
    public boolean handleEvent(Event evt) {
        if(evt.id == Event.WINDOW_DESTROY)
            System.exit(0);
        return false;
    }

    public static void main(String args[]) {
        DelapanDua f = new DelapanDua();
        f.resize(300,180);
        f.show();
    }
}
