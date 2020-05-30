import java.util.Scanner;

public class main {
    public static void main( String args[] ) {
        Scanner sc = new Scanner(System.in);
       	
       	// 主字串
       	String s1 = sc.next();
       	// 子字串
       	String s2 = sc.next();
       	// 找到的次數, 預設為0
       	int count = 0;
       	
       	for ( int i = 0; i < s1.length() ; i++ ){
       		if ( s1.indexOf(s2, i) != -1){
       			i = s1.indexOf(s2, i);
       			count++;
       		}
       	}
		System.out.printf("%s appears %d times in %s.\r\n",s2,count,s1);
    }
}
