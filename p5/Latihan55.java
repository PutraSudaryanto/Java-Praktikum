class Latihan55
{
	public static void main(String[] args)
	{
		int x=10, y;
		label1:
		while(x-->0)
		{
			y=1;
			while(x++<10)
			{
				if (y>x)
				{
					System.out.println();
					continue label1;
				}
			System.out.println(x*y +" ");
			}
		}
	}
}