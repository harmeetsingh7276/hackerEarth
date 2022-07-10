import java.util.Scanner;

class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t = s.nextInt();
		while (t>0) {
			long N = s.nextLong();//remember take long as the other numbers in the test case crosses the limit of int
			System.out.println((N*(N+1)));
			t--;
		}
		
	}
}