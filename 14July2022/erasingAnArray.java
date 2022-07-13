import java.util.Scanner;

class Test {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int[] a = getArrayPoppulated(n);
			numberOfInversionsRequired(a);
			t--;
		}

	}

	private static void numberOfInversionsRequired(int[] a) {
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				count++;
			}
		}
		System.out.println(count+1);
	}

	public static int[] getArrayPoppulated(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}