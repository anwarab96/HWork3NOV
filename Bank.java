package HWork3NOV14;

public class Bank {
int interest; 
int initialBalance;
Bank(int interest){//constructor with one parameter.
	this.interest = interest;
}
Bank(int interest, int initialBalance){//constructor with two parameters;
	this.interest=interest;
	this.initialBalance = initialBalance;
}
public void  soverienBank(int interest){
	System.out.println(" Soverien bank's interest rate is " + interest);
}
public void chase(int interest){
	System.out.println(" Chase bank's interest rate is " + interest);
}
public void wellfargo(int interest){
	System.out.println(" Wellfarge bank's interest rate is " + interest);
}
public void citiBank(int interest){
	System.out.println(" Citi bank's interest rate is " + interest);
}
public void TDBank(int interest){
	System.out.println(" TD bank's interest rate is " + interest);
}
public int getInterest(){
	int total =0;
	total = initialBalance + interest;
	return total;
}
}
