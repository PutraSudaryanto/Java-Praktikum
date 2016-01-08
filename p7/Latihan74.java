import java.util.Scanner;

class Fakultas {
    String nama, prodi;
    int jumlah;

    public Fakultas(String nm, int jm, String pr) {
        nama = nm;
        jumlah = jm;
        prodi = pr;
    }

    public void cetak() {
        System.out.println("nama fakultas = " +nama);
        System.out.println("jumlah program studi = " +jumlah+ " buah");
        System.out.println("program studi = " +prodi+ " buah");
    }
}

class Ekonomi extends Fakultas {
    public Ekonomi(String nama, int jumlah, String prodi) {
        super(nama, jumlah, prodi);
    }
}

class TI extends Fakultas {
    public TI(String nama, int jumlah, String prodi) {
        super(nama, jumlah, prodi);
    }
}

class Agro extends Fakultas {
    public Agro(String nama, int jumlah, String prodi) {
        super(nama, jumlah, prodi);
    }
}

class Psikologi extends Fakultas {
    public Psikologi(String nama, int jumlah, String prodi) {
        super(nama, jumlah, prodi);
    }
}

class Ikommed extends Fakultas {
    public Ikommed(String nama, int jumlah, String prodi) {
        super(nama, jumlah, prodi);
    }
}

class Latihan74 {
    public static void main(String[] args) {
		Ekonomi a = new Ekonomi("ekonomi", 2, "akuntansi dan manajemen");
        TI b = new TI("TI", 2, "SI da TI");
        Agro c = new Agro("agro", 3, "pertanian, THP dan agroindustri");
        Psikologi d = new Psikologi("psikologi", 1, "psikologi");
        Ikommed e = new Ikommed("ikommed", 1, "ilmu komunikasi");
        a.cetak();
        b.cetak();
        c.cetak();
        d.cetak();
        e.cetak();
    }
}
