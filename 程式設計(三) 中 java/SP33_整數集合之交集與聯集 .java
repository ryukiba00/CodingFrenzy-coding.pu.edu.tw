import java.util.*;

public class main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	ArrayList A = new ArrayList();
	ArrayList B = new ArrayList();
		
	while ( sc.hasNext() ){
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if ( n1 == 1 ){
			A.add(n2);
		}else{
			B.add(n2);
		}
	}
	Collections.sort(A);
	Collections.sort(B);
	
	// print 集合A
	for ( int i = 0 ; i < A.size()-1 ; i++ ){
		System.out.print(A.get(i)+",");
	}
	System.out.println(A.get(A.size()-1));
	
	// print 集合B
	for ( int i = 0 ; i < B.size()-1 ; i++ ){
		System.out.print(B.get(i)+",");
	}
	System.out.println(B.get(B.size()-1));
	
	// 判斷A是否屬於B
	int count1 = 0;
	for ( int i = 0 ; i < A.size() ; i++ ){
		if ( B.contains(A.get(i)) ){
			count1++;
		}
	}
	if ( count1 == A.size() ){
		System.out.println("A屬於B");
	}else{
		System.out.println("A不屬於B");
	}
	
	// print 交集的部分
	ArrayList list3 = new ArrayList();
	for ( int i = 0 ; i < A.size() ; i++ ){
		if ( B.contains(A.get(i)) ){
			list3.add(A.get(i));
		}
	}
	Collections.sort(list3);
	for ( int i = 0 ; i < list3.size() ; i++ ){
		if ( i != list3.size()-1 ){
			System.out.print(list3.get(i)+",");
		}else{
			System.out.println(list3.get(i));
		}
	}
	
	// print 聯集的部分
	ArrayList list4 = new ArrayList();
	for ( int i = 0 ; i < A.size() ; i++ ){
		list4.add(A.get(i));
	}
	for ( int i = 0 ; i < list3.size() ; i++ ){
		list4.remove(list3.get(i));
	}
	for ( int i = 0 ; i < B.size() ; i++ ){
		list4.add(B.get(i));
	}
	Collections.sort(list4);
	for ( int i = 0 ; i < list4.size() ; i++ ){
		if ( i != list4.size()-1 ){
			System.out.print(list4.get(i)+",");
		}else{
			System.out.println(list4.get(i));
		}
	}
	
	}
}