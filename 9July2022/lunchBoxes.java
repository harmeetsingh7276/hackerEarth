import java.util.Arrays;
import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int m = s.nextInt();

			int[] arr = new int[m];
			for (int i = 0; i < m; i++) {
				arr[i] = s.nextInt();
			}
			Arrays.sort(arr);
			int cnt = 0;
			for (int i = 0; i < m; i++) {
				if (n >= arr[i]) {
					n -= arr[i];
					cnt++;
				}
			}
			System.out.println(cnt);
			t--;
		}
	}
}
