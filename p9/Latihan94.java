import javax.swing.*;
import java.awt.event.*;

class Latihan94 extends JFrame
{
	JMenuBar mainmenu = new JMenuBar();
	
	JMenu menu_file = new JMenu("File");
		JMenuItem submenu_open = new JMenu("Open");
			JMenuItem content_data = new JMenuItem("Data Mahasiswa");
		JMenuItem submenu_exit = new JMenuItem("Exit");
	
	JMenu menu_about = new JMenu("About");
		JMenuItem submenu_about = new JMenuItem("About Us");
	
	Latihan94() {
		setTitle("Menu");
		setLocation(30,40);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void GUI() {
		setJMenuBar(mainmenu);
		mainmenu.add(menu_file);
			menu_file.add(submenu_open);
				submenu_open.add(content_data);
			menu_file.add(submenu_exit);
		mainmenu.add(menu_about);
			menu_about.add(submenu_about);
		
		setVisible(true);
	}
	
	public static void main(String []args) {
		Latihan94 i = new Latihan94();
		i.GUI();
	}
}
