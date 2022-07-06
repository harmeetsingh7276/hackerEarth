import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder revStr = new StringBuilder();
		revStr.append(str);
		revStr.reverse();
		// System.out.println(revStr.toString());
		if (str.equals(revStr.toString())) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
