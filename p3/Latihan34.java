import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan34
{
	public static void main (String[]args)
	{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		int p,l,s;
		
		try {
			System.out.println("Menghitung Luas Persegi");
			System.out.println("masukan nilai sisi = ");
			s = Integer.parseInt(input.readLine());
			float luasp=((float)(s*s));
			System.out.println("Luas Persegi = " +luasp+ "cm");
			System.out.println();
			System.out.println("Menghitung Luas Persegi Panjang");
			System.out.println("Masukan panjang = ");
			p = Integer.parseInt(input.readLine());
			System.out.println("masukan Lebar = ");
			l = Integer.parseInt(input.readLine());
			float luaspp=((float)(p*l));
			System.out.println("Luas Persegi Panajang= " +luaspp+ "cm");
			System.out.println();
		}
		catch (IOException e)
		{
			System.out.println("Error!!!!!!!!!!!!!!!");
		}
	}
}
