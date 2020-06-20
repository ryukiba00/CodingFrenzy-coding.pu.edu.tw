import java.util.Scanner;
public class main{
    public static void main(String args[]) {
        Scanner  sc = new  Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[n];
        /* 你的程式碼 */
        for ( int i = 0 ; i < n ; i++ ){
        	score[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int  totalCourses[] = new int[k];
        /* 你的程式碼 */
        for ( int i = 0 ; i < k ; i++ ){
        	totalCourses[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
             /* 你的程式碼 */
             try{
             	System.out.printf("%d student avg: %d\r\n",(i+1),(score[i]/totalCourses[i]));
             }catch(ArrayIndexOutOfBoundsException e){
             	System.out.printf("%d student avg: no course\r\n",(i+1));
             }catch(ArithmeticException e){
             	System.out.printf("%d student avg: zero course\r\n",(i+1));
             }
        }  // end for
    } // end main
}
