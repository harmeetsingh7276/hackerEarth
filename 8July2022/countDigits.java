import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		int [] cnt= {0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<num.length();i++) {
			int j=Character.getNumericValue(num.charAt(i));
			cnt[j]++;
		}
		for(int i=0;i<cnt.length;i++) {
			System.out.println(i+" "+cnt[i]);
		}
	}
}
