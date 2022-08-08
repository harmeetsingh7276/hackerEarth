package add;

import java.util.Scanner;

public class PrintCalender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		System.out.println("Enter Month");
		int month=sc.nextInt();
		System.out.println("Enter Start day of the Week for that month");
		String startDayOfMonth=sc.next();
		PrintCalender pc=new PrintCalender();
		int maxDaysOfMonth=pc.maxDaysInAMonth(year,month);
		int begin=pc.indexOfDay(startDayOfMonth);
		//System.out.println(maxDaysOfMonth);
		//System.out.println(begin);
		pc.printCalenderForThatMonth(begin,maxDaysOfMonth,month);
		
	}

	private void printCalenderForThatMonth(int begin, int maxDaysOfMonth,int month) {
		String header="  S  M  T  W  T  F  S";//2 spaces
		String monthNames[] = {"","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
		String monthName=monthNames[month];
		System.out.println(monthName);
		System.out.println(header);
		int day=1;
		for(int i=1;i<=(begin+maxDaysOfMonth);i++) {
			if(i%7==1) {
				System.out.println();
			}
			if(i<=begin) {
				System.out.print("  _");//2 spaces 1 _
			}else {
				if(day/10==0) {
					System.out.print("  "+day);//for single date digit 2 spaces
				}else {
					System.out.print(" "+day);//for double date digit 1 space
				}
				//System.out.print(day+" ");
				day++;
			}
		}
		
	}

	private int indexOfDay(String startDayOfMonth) {
		startDayOfMonth=startDayOfMonth.toLowerCase();
		switch(startDayOfMonth) {
		case "sunday":
			return 0;
		case "monday":
			return 1;
		case "tuesday":
			return 2;
		case "wednesday":
			return 3;
		case "thrusday":
			return 4;
		case "friday":
			return 5;
		case "saturday":
			return 6;
		default:
			return -10;
		}
	}

	private int maxDaysInAMonth(int year, int month) {
		int daysOfMonth[] = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean leapCondition=((year%400==0)||((year%100!=0)&&(year%4==0)));
		if(leapCondition) {
			daysOfMonth[2]=29;
		}
		int days=daysOfMonth[month];
		return days;
	}

}
