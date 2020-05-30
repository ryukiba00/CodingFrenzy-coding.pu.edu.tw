import java.util.*;

class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	// 宣告一個含空白的字串s
	String s = sc.nextLine();
	int max = 0;
	for ( int i = 0; i < s.length() ; i++ ){
		int count = 0;
		// 跳過字串中的空格
		if (s.charAt(i) == ' '){
			continue;
		}
		for ( int j = i; j < s.length() ; j++ ){
			if ( s.charAt(i) == s.charAt(j) ){
				count++;
			}
		}
		if ( count > max ){
			max = count;
		}
	}
	
	System.out.println(max);
	}
}