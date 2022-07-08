import java.util.Arrays;
import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for (int j = 0; j < testCases; j++) {
			String str = s.next();
			//System.out.println("String="+str);
			System.out.println(getAnswer(str));
		}
	}

	public static String getAnswer(String str) {
		if (isPalindrome(str)) {
			return "-1";
		} else {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String k = String.valueOf(ch);
			return k;
		}
	}

	public static boolean isPalindrome(String str) {
		StringBuilder revStr = new StringBuilder();
		revStr.append(str);
		revStr.reverse();
		if (str.equals(revStr.toString())) {
			return true;
		}
		return false;
	}
}
