import java.util.Scanner;

class Latihan43 {	
	public static void main(String[] args) {
		int nilai,i;
		Scanner scan = new Scanner(System.in);
		i=0;
		
		do {
			System.out.print("Masukan Nilai Anda=");
			nilai = scan.nextInt();

			if (nilai >=85& nilai<=100)
				System.out.print("Nilai anda A");
			else if (nilai>=70 & nilai<=84)
				System.out.print("Nilai anda B");
			else if (nilai>=55 & nilai<=69)
				System.out.print("Nilai anda C");
			else if (nilai>=30 & nilai<=54)
				System.out.print("Nilai anda D");
			else if (nilai>=0&nilai<=29)
				System.out.print("Nilai anda E");
			else 
				System.out.print("Nilai salah ");
			System.out.println("\n");
			i++;
		} while (i < 15);
	}
}