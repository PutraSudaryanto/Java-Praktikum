class Latihan54
{
	public static void main(String[] args)
	{
		int x =10;
		System.out.println("sebelum while");
		while(x-->1) 
		{
			if (x%2==0)
			continue;
			System.out.println("Nilai X :"+x);
	    }
		System.out.println("Setelah while");
	}
}