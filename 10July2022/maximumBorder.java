import java.util.Scanner;

class Test {
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) throws Exception {
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			int m = s.nextInt();
			String[] data = getArrayPopulated(n);
			getMaxBorders(data);
		}
	}

	private static String[] getArrayPopulated(int n) {
		String[] data = new String[n];
		for (int i = 0; i < data.length; i++) {
			// enter column check condition
			data[i] = s.next();
		}
		return data;
	}

	private static void getMaxBorders(String[] data) {
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			String temp = data[i];
			temp = temp.replace('.', ' ');
			temp = temp.trim();
			if (max < temp.length()) {
				max = temp.length();
			}
		}
		System.out.println(max);
	}
}