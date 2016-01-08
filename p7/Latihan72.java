import java.util.Scanner;

class Kendaraan {
    String nama;
    int roda;

    public Kendaraan(String nm, int rd) {
        nama = nm;
        roda = rd;
    }

    public void cetak() {
        System.out.println("jenis kendaraan = " +nama);
        System.out.println("jumlah roda = " +roda+ " buah");
    }
}

class Mobil extends Kendaraan {
    public Mobil(String nama, int roda) {
        super(nama, roda);
    }
}

class Truk extends Kendaraan {
    public Truk(String nama, int roda) {
        super(nama, roda);
    }
}

class Motor extends Kendaraan {
    public Motor(String nama, int roda) {
        super(nama, roda);
    }
}

class Latihan72 {
    public static void main(String[] args) {
		Mobil m = new Mobil("mobil", 4);
        Truk t = new Truk("truk", 6);
        Motor s = new Motor("motor", 2);
        m.cetak();
        t.cetak();
        s.cetak();
    }
}
