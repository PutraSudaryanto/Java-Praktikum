
import javax.swing.*;
import java.awt.event.*;

class Latihan813 extends JFrame
{
    // DEKLARASI LABEL
    JLabel labelFieldNim=new JLabel("NIM");
    JLabel labelFieldNama=new JLabel("Nama ");
    JLabel labelFieldAlamat=new JLabel("Alamat ");
    JLabel labelFieldJender= new JLabel("Gender ");
    JLabel labelFieldKelas=new JLabel("Kelas");
	
    // HALAMAN PENGISIAN
    JTextField Ni_Nim=new JTextField(30);
    JTextField Nm_Nama=new JTextField(30);
    JTextField Al_Alamat=new JTextField(30);
	
    // DEKLARASI RADIO BUTTON
    JRadioButton radio1=new JRadioButton("perempuan");
    JRadioButton radio2=new JRadioButton("laki-laki");   
    ButtonGroup RadioGroup=new ButtonGroup();
   
    // OPTIONAL
    String[] Kelas ={"pagi","sore","ekstensi"};    
    JComboBox comboKelas=new JComboBox(Kelas);
	
    // PILIHAN
    JButton B_save = new JButton("Save");
    JButton B_update = new JButton("Update");
    JButton B_exit = new JButton("Exit");
	
    Latihan813() {
        setTitle("DATA MAHASISWA");
        setLocation(30,40);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
    void GUI() {
        // LABEL
        getContentPane().add(labelFieldNim);
        labelFieldNim.setBounds(20,30,130,20);       
        getContentPane().add(labelFieldNama);
        labelFieldNama.setBounds(20,60,130,20);       
        getContentPane().add(labelFieldAlamat);
        labelFieldAlamat.setBounds(20,90,130,20);       
        getContentPane().add(labelFieldJender);
        labelFieldJender.setBounds(20,120,80,20);       
        getContentPane().add(labelFieldKelas);
        labelFieldKelas.setBounds(20,150,130,20);
		
        // HALAMAN PENGISIAN
        getContentPane().add (Ni_Nim);
        Ni_Nim.setBounds(100,30,130,25);       
        getContentPane().add (Nm_Nama);
        Nm_Nama.setBounds(100,60,130,25);       
        getContentPane().add (Al_Alamat);
        Al_Alamat.setBounds(100,90,250,25);
		
        // RADIO BUTTON
        getContentPane().add(radio1);
        radio1.setBounds(200,120,100,25);
        getContentPane().add(radio2);
        radio2.setBounds(100,120,100,25);
        RadioGroup.add(radio1);
        RadioGroup.add(radio2);
       
        // KOTAK OPTIONAL
        getContentPane().add(comboKelas);
        comboKelas.setBounds(100,150,130,25);
                   
        // BUTTON
        getContentPane().setLayout(null);
        getContentPane().add(B_save);
        getContentPane().add(B_update);
        getContentPane().add(B_exit);
      
        B_save.setBounds(20,180,100,20);
        B_update.setBounds(120,180,100,20);
        B_exit.setBounds(220,180,100,20);
		
        setVisible(true);
    }
    
   
    public static void main(String []args)
    {
        Latihan813 inputan=new Latihan813();
        inputan.GUI();
        
    }
}
