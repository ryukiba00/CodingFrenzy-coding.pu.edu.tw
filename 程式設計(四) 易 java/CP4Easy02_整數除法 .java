import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
       /* 你的程式碼 */
       try{
       		int x = Integer.parseInt(str1);
       		int y = Integer.parseInt(str2);
       		
       		System.out.print(x/y);
       }catch(NumberFormatException e){
       		System.out.println("Not a legal decimal string!");
       }catch(ArithmeticException e){
       		System.out.println("Can't divide by zero!");
       }      
    }
}
