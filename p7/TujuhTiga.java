public class TujuhTiga {
	private double r;
	
	public TujuhTiga(double r) {
		this.r = r;
	}
	
	public TujuhTiga() {
		r = 7.0;
	}
	
	public double keliling() {
		return 2*3.14*r;
	}
	
	public double luas() {
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		TujuhTiga L = new TujuhTiga();
		
		System.out.println("contoh polymorphism");
		System.out.println("\nLuas lingkaran adalahh : " + L.luas() + "CM");
		System.out.println("Keliling lingkaran adalahh : " + L.keliling() + "CM\n");
	}
}
