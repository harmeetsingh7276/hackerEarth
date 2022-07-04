import java.util.*;
class Test{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        int number=0;
        int[] data = new int[N];
        int[] b = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
            b[i]=data[i]%10;
        }
        for(int i=0; i<N; i++){
        	System.out.println(b[i]);
        }
        
        if(b[N-1]==0) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
	}
}