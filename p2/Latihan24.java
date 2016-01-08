public class Latihan24 {
	public static void main(String[] args) {
		int[][] a = new int[2][2];
		int[] c = new int[1];
		int[] d = new int[1];
		
		a[0][0] = 9;  a[0][1] = 3;
		a[1][0] = 4;  a[1][1] = 6;

		System.out.println("a[0][0] = " + a[0][0]);
		System.out.println("a[0][1] = " + a[0][1]);
		System.out.println("a[1][0] = " + a[1][0]);
		System.out.println("a[1][1] = " + a[1][1]);
		
		c[0] = a[0][0]+a[1][0]+a[0][1]+a[1][1];
		System.out.println("penjumlahan array = " + c[0]);
		
		d[0] = a[0][0]*a[1][0]*a[0][1]*a[1][1];
		System.out.println("perkalian array = " + d[0]);
	}
}
