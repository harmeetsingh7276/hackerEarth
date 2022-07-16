import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for (int j = 0; j < testCases; j++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(getMaxDifference(arr));
		}
	}

	public static int getMaxDifference(int[] arr) {
		Map<Integer, Integer> firstMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> lastMap = new HashMap<Integer, Integer>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			firstMap.putIfAbsent(arr[i], i + 1);
		}
		for (int i = n - 1; i >= 0; i--) {
			lastMap.putIfAbsent(arr[i], i + 1);
		}
		int total = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int element : arr) {
			set.add(element);
		}
		
		for(int element:set) {
			if(firstMap.get(element)!=null && lastMap.get(element)!=null) {
				int diff=lastMap.get(element)-firstMap.get(element);
				total+=diff;
			}
		}
		return total;
	}
}
