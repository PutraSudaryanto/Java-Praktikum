import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan33
{
	public static  void  main (String[]args)
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String Nama = "";
		String Alamat = "";
		String Hobi = "";
		String Hp = "";
		
		try {
			System.out.println("from registrasi:");
			System.out.println();
			System.out.print("masukan nama anda : ");
			Nama = input.readLine();
			System.out.print("masukan alamat anda :");
			Alamat = input.readLine();
			System.out.print("masukan hobi anda :");
			Hobi = input.readLine();
			System.out.print("masukan nomer hp anda :");
			Hp = input.readLine();
			System.out.println();
			System.out.println("welcome");
			System.out.println("terdaftar sebagai" +Nama);
			System.out.println("alamat" +Alamat);
			System.out.println("hobi" +Hobi);
			System.out.println("nomer Hp" +Hp);
		}
		catch (IOException e)
		{
			System.out.println("Error!!!!!!!!!!!!!");
		}
	}
}
