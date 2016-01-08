class Latihan71 {
	private double alas;
	private double tinggi;

	public Latihan71() {
		alas = 0;
		tinggi = 0;
	}

	private double luas(double a, double t) {
		return (a*t)/2;
	}

	public double getLuas(double luas) {
		return luas(alas, tinggi);
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public double getAlas(double alas) {
		return alas;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public double getTinggi(double tinggi) {
		return tinggi;
	}

	public static void main(String[] args) {
		Latihan71 s = new Latihan71();
		s.setAlas(4);
		s.setTinggi(5);
		System.out.println("contoh enkapsulasi");
		System.out.println("luas Latihan71 = "+ s.getLuas(0));
	}
}
