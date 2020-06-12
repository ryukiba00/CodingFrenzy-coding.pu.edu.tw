import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String A = sc.next();
	String B = sc.next();
	
	String s1[] = A.split("/");
	String s2[] = B.split("/");
	
	// 年份判斷
	if ( Integer.parseInt(s1[2]) > Integer.parseInt(s2[2]) ){
		System.out.println("After");
		System.exit(1);
	}else if ( Integer.parseInt(s1[2]) < Integer.parseInt(s2[2]) ){
		System.out.println("Before");
		System.exit(1);
	}
	// 月份判斷
	if ( Integer.parseInt(s1[1]) > Integer.parseInt(s2[1]) ){
		System.out.println("After");
		System.exit(1);
	}else if ( Integer.parseInt(s1[1]) < Integer.parseInt(s2[1]) ){
		System.out.println("Before");
		System.exit(1);
	}
	// 天份判斷
	if ( Integer.parseInt(s1[0]) > Integer.parseInt(s2[0]) ){
		System.out.println("After");
		System.exit(1);
	}else if ( Integer.parseInt(s1[0]) < Integer.parseInt(s2[0]) ){
		System.out.println("Before");
		System.exit(1);
	}
	// 如果都相同
	System.out.println("Same");
	
	
	
	
	}
}