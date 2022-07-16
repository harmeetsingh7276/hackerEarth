import java.util.Scanner;

class Test {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		long D = s.nextInt();
		long Oc = s.nextInt();
		long Of = s.nextInt();
		long Od = s.nextInt();
		long Cs = s.nextInt();
		long Cb = s.nextInt();
		long Cm = s.nextInt();
		long Cd = s.nextInt();

		long OnlineCabCost = Oc + ((D - Of) * Od);
		long ClassicCabCost = Cb + ((D / Cs) * Cm) + (D * Cd);

//		System.out.println(OnlineCabCost);
//		System.out.println(ClassicCabCost);

		if (OnlineCabCost <= ClassicCabCost) {
			System.out.println("Online Taxi");
		} else {
			System.out.println("Classic Taxi");
		}
	}
}