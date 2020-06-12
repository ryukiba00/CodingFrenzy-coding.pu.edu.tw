import java.util.Scanner;

abstract class bankAccount {
	private String accountID;
	private String accountType;
	private int numberWithdraw;
	
	public int getNumberWithdraw() {
		return numberWithdraw;
	}
	
	bankAccount(String id, String type, int num){
		accountID = id;
		accountType = type;
		numberWithdraw = num;
	}
	
	abstract int calculateFee();
}
class savingAccount extends bankAccount {
	/* 你的程式碼 */
	savingAccount( String id, String type, int numWithdraw){
		super( id, type, numWithdraw );
	}
	public int calculateFee(){
		if (getNumberWithdraw() > 3){
			return 10 * (getNumberWithdraw()-3);
		}else{
			return 0;
		}
	}
}	
class checkingAccount extends bankAccount {
	/* 你的程式碼 */
	checkingAccount( String id, String type, int numWithdraw){
		super( id, type, numWithdraw );
	}
	public int calculateFee(){
		if (getNumberWithdraw() < 20 ){
			return 50 * getNumberWithdraw();
		}else{
			return 1000;
		}
	}
}	

public class main {
	public static void main(String args[])  {
		String id, type;
		int N,num;
		Scanner inp = new Scanner(System.in);
		N = inp.nextInt();
		
		for(int i=0; i<N; i++) {
			id = inp.next();
			type = inp.next(); 
			num = inp.nextInt();
			if (type.equals("saving")) {
				savingAccount sav  = new savingAccount(id, type, num);
				System.out.println(id + " " + sav.calculateFee());
			}
			else if (type.equals("checking")) {
				checkingAccount check = new checkingAccount(id, type, num);
				System.out.println(id + " "+ check.calculateFee());
			}
		}
	}
}
