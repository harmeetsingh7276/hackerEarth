import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		String s="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s+=Character.toLowerCase(str.charAt(i));
				
			}
			else {
				s+=Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(s);
	}
}
