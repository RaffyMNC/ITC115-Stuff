
public class assignment3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printPowersOfN(4, 3));
		System.out.println(printPowersOfN(5, 6));	
		System.out.println(printPowersOfN(-2, 8));
		System.out.println(printPowersOfN(9,9));
		
	}
		
		public static int printPowersOfN(int b, int e) {
			
			int number=1;
			for (int i=0; i <e; i++) {
				System.out.print((int)Math.pow(b, i)+" ");
				number*=b;
				
			
		}
			return number;
	
		}
}



