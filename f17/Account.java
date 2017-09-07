//Account.java
//Account object reference example
//Alan Jamieson
//COSC 201
//Fall 2017
//September 6, 2017

public class Account {

	public int dollars;
	
	public Account(int d) {
		dollars = d;
	}
	
	//transfer all the money from rhs to this object
	public void finalTransfer(Account rhs) {
		dollars += rhs.dollars;
		rhs.dollars = 0;
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account(2000);
		Account acc2 = acc1;
		acc1.finalTransfer(acc2);
		System.out.println(acc1.dollars);
	}

}
