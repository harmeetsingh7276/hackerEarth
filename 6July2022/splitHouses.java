import java.util.*;
class Test {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);  
        
        //System.out.println("Hi, Enter number of grids ");
        int grids = Integer.parseInt(s.nextLine());   
        
        //System.out.println("Enter house Structure ");
        String houseStructure=s.next();
        //System.out.println(houseStructure);
        houseStructure=houseStructure.replace('.', 'B');
        if(houseStructure.contains("HH")) {
        	System.out.println("NO");
        }
        else {
        	System.out.println("YES");
        	System.out.println(houseStructure);
        }

    }
}
