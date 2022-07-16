import java.util.*;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);

		int arraySize = Integer.parseInt(s.nextLine());
		// System.out.println("Enter Elements");
		String data = s.nextLine();
		String[] arrStr = data.split(" ");
		int[] arrInt = new int[arraySize];
		int i = 0;
		while (i < arraySize) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
			i++;
		}
		double modValue = Math.pow(10, 9) + 7;

		double answer = 1;
		for (int j = 0; j < arrInt.length; j++) {
			answer = (answer * arrInt[j]) % modValue;
		}
		int a = (int) answer;
		System.out.println(a);
	}
}


//More Efficient

import java.util.*;

class Test

{

	public static void main(String args[])

	{

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		long answer = 1L;

		for (int i = 0; i < N; i++)

		{

			answer = (answer * s.nextInt()) % 1000000007;

		}

		System.out.println(answer);

	}

}