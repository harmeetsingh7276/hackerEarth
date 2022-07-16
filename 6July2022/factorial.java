import java.util.*;

class Test {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int number = Integer.parseInt(s.nextLine());
		//System.out.println("Factorial for " + number + "=");
		factorial(number);

	}

	private static void factorial(int number) {
		int counter = number;
		int answer = 1;
		while (counter != 1) {
			answer *= counter;
			counter--;
		}
		System.out.println(answer);
	}
}
