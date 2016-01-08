public class Latihan73 {
	private double r;
	
	public Latihan73(double r) {
		this.r = r;
	}
	
	public Latihan73() {
		r = 7.0;
	}
	
	public double keliling() {
		return 2*3.14*r;
	}
	
	public double luas() {
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		Latihan73 L = new Latihan73();
		
		System.out.println("contoh polymorphism");
		System.out.println("\nLuas lingkaran adalahh : " + L.luas() + "CM");
		System.out.println("Keliling lingkaran adalahh : " + L.keliling() + "CM\n");
	}
}
