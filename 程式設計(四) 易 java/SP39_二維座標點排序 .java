// 註: 耗時時間似乎有些過長

import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	// n, 輸入座標數量
	int n = sc.nextInt();
	// m[][], 輸入座標
	int m[][] = new int[n][2];
	for ( int i = 0 ; i < n ; i++ ){
		m[i][0] = sc.nextInt();
		m[i][1] = sc.nextInt();
	}
	
	String s[] = new String[n];
	for ( int i = 0; i < n ; i++ ){
		s[i] = Integer.toString(m[i][0])+" "+Integer.toString(m[i][1]);
	}
	Arrays.sort(s);
	
	for ( int i = 0; i < n ; i++ ){
		System.out.println(s[i]);
	}
	
	}
}