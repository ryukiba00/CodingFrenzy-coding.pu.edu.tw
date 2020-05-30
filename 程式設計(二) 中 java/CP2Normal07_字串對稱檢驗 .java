import java.util.Scanner;

class main{
	public static void main(String args[ ]){
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	
	int j = s.length()-1; 
	String  str = "";
	for (int i = 0; i < (s.length()/2); i++ ){
		if ( s.charAt(i) != s.charAt(j) ){
			str = "NO";
			break;
		}else{
			j--;
			str = "YES";
		}
	}
	System.out.println(str);
	}
}