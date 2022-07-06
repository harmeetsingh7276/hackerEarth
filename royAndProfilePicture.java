import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		int N = s.nextInt();
		int j = 0;
		while (j < N) {
			int[] arrA = new int[2];
			for (int i = 0; i < 2; i++) {
				arrA[i] = s.nextInt();
			}
			if (arrA[0] < L || arrA[1] < L) {
				System.out.println("UPLOAD ANOTHER");
			} else if (arrA[0] == arrA[1] ) {
				System.out.println("ACCEPTED");
			} else {
				System.out.println("CROP IT");
			}
			j++;
		}
	}
}
