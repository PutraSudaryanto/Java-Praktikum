import java.awt.*;

public class Latihan84 extends Frame {
    public Latihan84() {
        setTitle("Contoh Button");
        setLayout(new FlowLayout());
        add(new Button("yellow"));
        add(new Button("blue"));
        add(new Button("orange"));
        add(new Button("cyan"));
        add(new Button("pink"));
        add(new Button("red"));
        add(new Button("white"));
    }

    public boolean action(Event evt, Object arg) {
        if(arg.equals("yellow"))
            setBackground(Color.yellow);
        else if(arg.equals("blue"))
            setBackground(Color.blue);
        else if(arg.equals("orange"))
            setBackground(Color.orange);
        else if(arg.equals("cyan"))
            setBackground(Color.cyan);
        else if(arg.equals("pink"))
            setBackground(Color.pink);
        else if(arg.equals("red"))
            setBackground(Color.red);
        else if(arg.equals("white"))
            setBackground(Color.white);
        else
            return false;

        repaint();
        return true;
    }

    public static void main(String args[]) {
        Latihan84 f = new Latihan84();
        f.setLocation(300,100);
        f.resize(400,300);
        f.show();
    }
}
