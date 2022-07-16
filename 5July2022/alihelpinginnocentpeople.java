//import for Scanner and other utility classes
import java.util.*;

class Test {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        List<Character> vowel = new ArrayList<Character>();
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        vowel.add('Y');
        Boolean a=((Character.getNumericValue(name.charAt(0))+Character.getNumericValue(name.charAt(1)))%2)==0;
        Boolean b=((Character.getNumericValue(name.charAt(3))+Character.getNumericValue(name.charAt(4)))%2)==0;
        Boolean c=((Character.getNumericValue(name.charAt(4))+Character.getNumericValue(name.charAt(5)))%2)==0;
        Boolean d=((Character.getNumericValue(name.charAt(7))+Character.getNumericValue(name.charAt(8)))%2)==0;   
        Boolean e=vowel.contains(name.charAt(2));
        if(!e && a && b && c && d){
        	System.out.println("valid");
        }
        else {
        	System.out.println("invalid");
        }
	}
}

