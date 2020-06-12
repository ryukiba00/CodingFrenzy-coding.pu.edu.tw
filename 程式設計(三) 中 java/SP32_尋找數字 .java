import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	String s1 = String.valueOf(n);
	String s2 = String.valueOf(m);
	ArrayList list1 = new ArrayList();
	
	// print 次數
	int count = 0;
	for( int i= 0 ; i < s2.length() ; i++ ){
		if ( s2.indexOf(s1,i) != -1 ){
			if ( list1.contains(s2.indexOf(s1,i)) == false ){
				list1.add(s2.indexOf(s1,i));
				count++;
			}
		}
	}
	System.out.println(count);
	
	// print 位置(從右開始)
	for( int i= 0 ; i < list1.size() ; i++ ){
		//System.out.print(list1.get(i)+" ");
		System.out.print((s2.length()-Integer.parseInt(String.valueOf(list1.get(i))))+" ");
	}
	System.out.println();
	
	}
}