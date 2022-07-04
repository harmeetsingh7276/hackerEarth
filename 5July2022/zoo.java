import java.util.*;
class TestClass {
    
    static int charCount(String text,char c){
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==c){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();                 // Reading input from STDIN
        //System.out.println(text);  // Writing output to STDOUT
        
        int x=charCount(text,'z');
        int y=charCount(text,'y');
        int twoX=2*x;
        if(twoX==y){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
