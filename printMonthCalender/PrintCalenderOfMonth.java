package add;

import java.util.Scanner;

public class PrintC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int yy = sc.nextInt();
		System.out.println("Enter Month");
		int mm = sc.nextInt();
		int d = 1;
		int m = 1;
		int y = 1;
		int dy = 1;// counter
		String day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		String month[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER",
				"OCTOBER", "NOVEMBER", "DECEMBER" };
		int ar[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//logic to get the day
		while (true) {
			if (d == 1 && m == mm && y == yy) {
				break;
			}
			// leap year check
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
				ar[1] = 29;
			} else {
				ar[1] = 28;
			}
			dy++;
			d++;
			// if max days of month are over
			if (d > ar[m - 1]) {
				m++;
				d = 1;
			}

			if (m > 12) {
				m = 1;
				y++;
			}

			if (dy == 7) {
				dy = 0;
			}
		}

		int c = dy;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
			ar[1] = 29;
		} else {
			ar[1] = 28;
		}
		// print month
		System.out.println("MONTH:" + month[mm - 1]);
		// print week days header
		for (int k = 0; k < 7; k++) {
			System.out.print("   " + day[k]);
		}
		
		System.out.println();
		//didn't get
//		for (int j = 1; j <= (ar[mm-1]+dy); j++) {
//			if(j>6) {
//				dy=dy%6;
//			}
//		}
		
		int spaces=dy;
//		if(spaces<0) {
//			spaces=6;
//		}
		
		for (int i = 0; i < spaces; i++)
            System.out.print("      ");
		
		for (int i = 1; i <= ar[mm - 1]; i++) {
            System.out.printf(" %4d ", i);
          //print new line after 7 days or 30 days
            if(((i+spaces)%7==0)||(i==ar[mm-1])) {
            	System.out.println();
            }
		}

	}

}
