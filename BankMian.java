package HWork3NOV14;

public class BankMian {

	public static void main(String[] args) {     
	    Bank ba = new Bank(7,9000);
		        ba.chase(3);
		        ba.citiBank(9);
		        ba.soverienBank(2);
		        ba.wellfargo(2);
		        ba.TDBank(5);
		        //ba.setInterest(1000,9);
		        System.out.println(ba.getInterest());


	}

}
