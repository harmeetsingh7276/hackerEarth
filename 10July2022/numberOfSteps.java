import java.util.Arrays;
import java.util.Scanner;
 
class Test {
	static Scanner s = new Scanner(System.in);
 
	public static void main(String args[]) throws Exception {
		int n = s.nextInt();
		int[] a = getArrayPoppulated(n);
		int[] b = getArrayPoppulated(n);
		getStepsTakenToMakeAllAItemsEqual(a, b);
	}
 
	private static void getStepsTakenToMakeAllAItemsEqual(int[] a, int[] b) {
		int steps = 0;
		int aMin=Arrays.stream(a).min().getAsInt();
		for (int i = 0; i < a.length; i++) {
				while(a[i]>aMin && a[i]>=b[i]) {
					a[i]-=b[i];
					++steps;
				}
				if(a[i]<aMin && a[i]>0) {
					aMin=a[i];
					i=-1;
				}
				else if(a[i]<0 || a[i]!=aMin) {
					steps=-1;
					break;
				}
		}
		System.out.println(steps);
	}
 
	private static int[] getArrayPoppulated(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
}