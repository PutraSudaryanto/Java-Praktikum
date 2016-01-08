import java.awt.*;

public class DelapanSatu extends Frame {
    public static void main(String[] args) {
        DelapanSatu f = new DelapanSatu();
        f.resize(250,150);
        f.show();
    }
    
    public boolean handleEvent(Event evt) {
        if(evt.id == Event.WINDOW_DESTROY)
            System.exit(0);
        return false;
    }
}
