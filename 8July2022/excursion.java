import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		for (int i = 0; i < testCase; i++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int cnt = 0;
			cnt = n / k;
			if (n % k != 0) {
				cnt += 1;
			}
			cnt += m / k;
			if (m % k != 0) {
				cnt += 1;
			}
			System.out.println(cnt);
		}

	}
}
