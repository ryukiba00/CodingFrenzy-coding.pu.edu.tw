import java.util.Scanner;

class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		System.out.print(n+"=");
		
		int count = 0;
		boolean b = false;
		for ( int i = 2 ; i <= n ; i++ ){
			count = 0;
			for ( int j = 2; j <= i  ; j++ ){
				if ( i % j == 0 ){
					count += 1;
				}
			}
			if ( count == 1 ){
				while ( n % i == 0 ){
					System.out.print(i);
					n /= i;
					if( n != 1 ){
						System.out.print('*');
					}else{
						b = true;
					}	
				}
			}
			if ( b == true ){
				break;
			}
		}
		
	}
}