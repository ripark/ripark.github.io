// Proj2Driver.java
// Alan C. Jamieson
// COSC 201 - Fall 2015
// Last Revision: November 10th, 2015

// Testing driver for Assignment 2 - Expression Evaluator
// Name of target class: StackCalculator
// Name of target method: processInput(String)

// Testing
public class Proj2Driver {

	public static void main(String[] args) {
		StackCalculator test = new StackCalculator();

		//Valid Test 1 - operations test
		System.out.println("Valid Test 1");
		System.out.println("Expected output: ");
		System.out.println("\t 6");
		System.out.println("\t -12");
		System.out.println("\t 347490");
		System.out.println("\t 1");
		System.out.println("\t 600000000");
		test.processInput("2 +      4");
		test.processInput("6-\t 18");
		test.processInput("234 * 45 * 33");
		test.processInput("31 / 4 - 6");
		test.processInput("31 % 4 * 200000000");
		System.out.println("");

		//Valid Test 2 - variable test
		System.out.println("Valid Test 2");
		System.out.println("Expected output: ");
		System.out.println("\t x is set to 5");
		System.out.println("\t 30");
		System.out.println("\t x is set to 46");
		System.out.println("\t 1522");
		System.out.println("\t y is set to -80");
		System.out.println("\t -960");
		test.processInput("x = 5");
		test.processInput("x * 6");
		test.processInput("x = 12%x * 3 + 12 - 4 + 2^5");
		test.processInput("33 * x + 4");
		test.processInput("y=  8 + 4 - x *2");
		test.processInput("12 * y");
		System.out.println("");

		//Valid Test 3 - right associative test
		System.out.println("Valid Test 3");
		System.out.println("Expected output: 43046721");
		test.processInput("3 ^ 2 ^ 2 ^ 2");
		System.out.println("");

		//Valid Test 4, parentheses test, variable continuity test
		System.out.println("Valid Test 4");
		System.out.println("Expected output: 457");
		test.processInput("([4 + 6] * x + 2 - {3 + 2})");
		System.out.println("");

		//Valid Test 5, unary operators
		System.out.println("Valid Test 5");
		System.out.println("Expected output:");
		System.out.println("\t 40");
		System.out.println("\t -12");
		System.out.println("\t 10");
		System.out.println("\t 5");
		test.processInput("--40");
		test.processInput("---12");
		test.processInput("+10");
		test.processInput("10 + ---5");

		//Error Test 1 - unbalanced parentheses
		System.out.println("Error Test 1");
		System.out.println("Expected output: Unbalanced Parentheses Error, Too Many Left Parentheses");
		test.processInput("((())())(((()))");
		System.out.println("Expected output: Unbalanced Parentheses Error, Mismatched Parentheses");
		test.processInput(")(");
		System.out.println("Expected output: Unbalanced Parentheses Error, Mismatched Parentheses");
		test.processInput("([)]");
		System.out.println("");

		//Error Test 2 - undefined variable
		System.out.println("Error Test 2");
		System.out.println("Expected output: Undefined Variable Y");
		test.processInput("Y + 6 * 12 ^ 3");
		System.out.println("");

		//Error Test 3 - invalid symbol
		System.out.println("Error Test 3");
		System.out.println("Expected output: Invalid Symbol ~");
		test.processInput("6 * 14 + 324 * 2 ~ 1 ");
		System.out.println("");

		//Error Test 4 - invalid variable name
		System.out.println("Error Test 4");
		System.out.println("Expected output: Invalid Variable Name AB");
		test.processInput("AB = 32 + x");
		System.out.println("");

		//Error Test 5 - nonsensical input
		System.out.println("Error Test 5");
		System.out.println("Expected output: Nonsensical Input 18 *%+ 5");
		test.processInput("18 *%+ 5");
		System.out.println("");

	}

}
