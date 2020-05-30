import java.util.Scanner;
import java.lang.Integer;

public class main  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        System.out.println(countOne(num));
    }

    public static int countOne(int val) {
    	int count = 0;
    	// Integer.toBinaryString(), 10進位轉2進位
    	String s = Integer.toBinaryString(val); 
    	
    	for (int i = 0 ; i < s.length() ; i++ ){
    		if( s.charAt(i) == '1' ){
    			count += 1;
    		}
    	}
    	
    	return count;
    }
}
