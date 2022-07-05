import java.util.*;

class Test {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		String dataArr[] = data.split(" ");
		int low = Integer.parseInt(dataArr[0]);
		int high = Integer.parseInt(dataArr[1]);
		int divisor = Integer.parseInt(dataArr[2]);
		int count = 0;
		while (low <= high) {
			if (low % divisor == 0) {
				count++;
			}
			low++;
		}
		System.out.println(count);
	}
}
