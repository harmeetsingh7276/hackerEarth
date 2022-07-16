import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Test {
	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		//System.out.println("Enter Number of TestCases=");
		int numberOfTestCases = Integer.parseInt(s.nextLine());
		int i = 0;
		while (i < numberOfTestCases) {
			//System.out.println("Enter Cost Green and Purple Ballon of TestCases=");
			String costOfGreenAndPurpleBallons = s.nextLine();
			String costArr[] = costOfGreenAndPurpleBallons.split(" ");
			int costOfGreenBallon = 0;
			int costOfPurpleBallon = 0;
			if (i%2 == 0) {
				costOfGreenBallon = Integer.parseInt(costArr[0]);
				costOfPurpleBallon = Integer.parseInt(costArr[1]);
			} else {
				costOfGreenBallon = Integer.parseInt(costArr[1]);
				costOfPurpleBallon = Integer.parseInt(costArr[0]);
			}

			//System.out.println("Green Ballon=" + costOfGreenBallon);
			//System.out.println("Purple Ballon=" + costOfPurpleBallon);

			//System.out.println("Enter Number of participant");
			int numberOfParticipants = Integer.parseInt(s.nextLine());
			int minimumCost = 0;
			for (int j = 0; j < numberOfParticipants; j++) {
				//System.out.println("Enter status of participant " + (j + 1));
				String statusOfUser = s.nextLine();
				String statusArr[] = statusOfUser.split(" ");
				int firstProblemSolved = Integer.parseInt(statusArr[0]);
				int secondProblemSolved = Integer.parseInt(statusArr[1]);
				minimumCost = minimumCost + (firstProblemSolved * costOfGreenBallon)
						+ (secondProblemSolved * costOfPurpleBallon);

			}
			//System.out.println("Test Case =" + minimumCost);
			System.out.println(minimumCost);

			i++;// TestCases counter
		}

	}
}
