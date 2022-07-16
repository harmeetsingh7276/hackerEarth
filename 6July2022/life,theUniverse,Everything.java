import java.util.*;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int data = Integer.parseInt(s.nextLine());
		while (data != 42) {
			System.out.println(data);
			data = Integer.parseInt(s.nextLine());
		}

	}
}



//Less execution time 

import java.util.*;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		while(true){
			int data=s.nextInt();
			if(data==42){
				break;
			}
			System.out.println(data);
		}
	}
}
