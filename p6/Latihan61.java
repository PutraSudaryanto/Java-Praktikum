class bangundatar
{
	int sisi=5;
	int alas=6;
	int tinggi=7;
	int sisi_miring=8;
	int LuasSegitiga, LuasPersegi, KelilingSegitiga, KelilingPersegi;
	
	bangundatar()
	{
		LuasSegitiga = (alas*tinggi)/2;
		KelilingSegitiga = (alas+sisi_miring+sisi_miring);
		LuasPersegi = (sisi*sisi);
		KelilingPersegi = (4*sisi);
	}
	bangundatar(int LS, int LS1)
	{
		LuasSegitiga = LS; KelilingSegitiga = LS;
		LuasPersegi = LS1; KelilingPersegi = LS1;
	}
	void cetak ()
	{
		if (LuasSegitiga == 0 && LuasPersegi == 0)
		return;
		System.out.println("Luas Segitiga : " +LuasSegitiga);
		System.out.println("Luas Persegi : " +LuasPersegi);
	}
	void cetak2()
	{
		if (KelilingSegitiga == 0 && KelilingPersegi == 0)
		return;
		System.out.println("keliling Segitiga : " +KelilingSegitiga);
		System.out.println("keliling Persegi : " +KelilingPersegi);
	}
}
class Latihan61
{
	public static void main(String[] args)
	{
		bangundatar p, s;
		p = new bangundatar();
		s = new bangundatar();
		p.cetak();
		s.cetak2();
	}
}
