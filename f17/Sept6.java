//Sept6.java
//javadoc example
//To compile javadoc go to Project->Generate javadoc
//Alan Jamieson
//COSC 201
//Fall 2017
//September 6, 2017

public class Sept6 {

	/**
	 * add2integers - sum two integers
	 * @param a One of the integers to be added.
	 * @param b One of the integers to be added.
	 * @return Sum of a and b.
	 */
	public int add2integers(int a, int b) {
		return a+b;
	}
	
	/**
	 * recursiveFactorial - calculate the factorial of an integer parameter
	 * @param a
	 * @return a!
	 */
	public int recursiveFactorial(int a) {
		if (a == 1) return 1;
		return a * recursiveFactorial(a-1);
	}
	
	public static void main(String[] args) {
		Sept6 s = new Sept6();
		System.out.println(s.add2integers(3, 4));
		System.out.println(s.recursiveFactorial(7));
	}

}
