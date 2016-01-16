import java.util.Scanner;

class Latihan41 {	
	public static void main(String[] args) {
		int a, b, i;
		Scanner scan = new Scanner(System.in);
		i=0;
		
		do {
			System.out.print("Masukkan nilai 1-100:");
			a = scan.nextInt();
			b = a/2;

			if (b > 5)
				System.out.println("Pernyataan 1 dieksekusi");
			else {
				System.out.println("Pernyataan 2 dieksekusi");
				System.out.println("Pernyataan 3 dieksekusi");
			}
			System.out.println("\n");
			i++;
		} while (i < 15);
	}
}