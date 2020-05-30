import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int n = sc.nextInt();
	
	// 計算出r
	int r = n%256+5;
	if(r > 255){
		r = 255;
	}
	n /= 256;
	
	// 計算出g
	int g = n%256+5;
	if( g > 255 ){
		g = 255;
	}
	n/=256;
	
	// 計算出b
	int b = n%256+5;
	if(b > 255){
		b = 255;
	}
	n/=256;
	
	System.out.println(256*256*b+256*g+r);
	
	}
}