import java.util.Scanner;
import java.util.Arrays;

public class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// 輸入正整數n
		int n = sc.nextInt();
		// 設空陣列
		int arr[] = new int[n];
		// 輸入n個數字
		for ( int i = 0 ; i < n ; i++ ){
			arr[i] = sc.nextInt();
		}
		// 由小到大排序
		Arrays.sort(arr);
		
		/*for ( int i = 0 ; i < n ; i++ ){
			System.out.println(arr[i]);
		}*/
		
		
		// 計算次數用, 預設為0
		int count = 0;
		// j 為驗證用數字, 預設為陣列第0個數字
		int j = arr[0];
		
		for ( int i = 0 ; i < n ; i++ ){
			if ( j == arr[i] ){
				count++;
				if ( i == n-1 && count > 1 ){
					System.out.println(j+" "+count);
				}
			}else if( j != arr[i]  ){
				if ( count > 1 ){
					System.out.println(j+" "+count);
				}
				j = arr[i];
				i -= 1;
				count = 0;
			}
		}
		
	}
}