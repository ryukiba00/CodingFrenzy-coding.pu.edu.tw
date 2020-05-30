import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String str[] = new String[3];
        str[0] = s1;
        str[1] = s2;
        str[2] = s3;
        
        Arrays.sort(str);
        
        for ( int i = 0 ; i < 2 ; i++ ){
        	System.out.print(str[i]+" ");
       	}
       	System.out.println(str[2]);
    }
}
