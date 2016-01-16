import java.util.Scanner;

class Latihan42 {	
	public static void main(String[] args) {
		int bulan, i;
		Scanner scan = new Scanner(System.in);
		i=0;
		
		do {			
			System.out.print("Masukkan bulan (dalam angka):");
			bulan = scan.nextInt();
			
			switch(bulan) {
				case 1: 
					System.out.println("Kuartal 1");
				break;
				case 2: 
					System.out.println("Kuartal 2");
				break;
				case 3: 
					System.out.println("Kuartal 3");
				break;
				default:
					System.out.println("Kuartal 4");					
			}
			i++;
		} while (i <= 12);
	}
}