import java.util.Scanner;
/* 你的程式碼 */
class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	String s = sc.nextLine().toLowerCase();
	int count = 0;
	
	for ( int i = 0; i < 26 ; i++ ){
		count = 0;
		for ( int j = 0; j < s.length() ; j++ ){
			if ( s.charAt(j)  == (char)(97+i) ){
				count += 1;
			}
		}
		if ( count > 0 ){
			System.out.printf("(%c,%d)",(char)(97+i),count);
		}
	}
	
	}
}