//Aug30.java
//Solution to exercises assigned August 30th
//Alan Jamieson
//COSC 201
//Fall 2017
//September 1, 2017

import java.util.Scanner;
import java.util.Random;

public class Aug30 {

	//Method to determine the maximum (or tie) between three integers passed in as a parameter
	//Precondition: three integers
	//Postcondition: print statement either printing the maximum or tie
	public void method1(int a, int b, int c){
		if (a > b && a > c)
			System.out.println(a);
		else if (b > a && b > c)
			System.out.println(b);
		else if (c > a && c > b)
			System.out.println(c);
		else if (a == b || c == a || b == c)
			System.out.println("There was a tie");
	}
	
	//Method to print the elements in an array using a for-each loop
	//Precondition: integer array
	//Postcondition: print of each element of the array
	public void printArray(int [] a){
		for(int i : a)
			System.out.println(i);
	}
	
	//Method to print 100 random numbers
	//Precondition: none
	//Postcondition: print of 100 random numbers from 0-99
	public void randomGenerator(){
		Random r = new Random();
		for (int i = 0; i<100; i++)
			System.out.println(r.nextInt(100));
	}
	
	//main method, runs all three methods
	public static void main(String[] args) {
		Aug30 joe = new Aug30();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        joe.method1(a, b, c);
        int [] myarray = {4, 8, 12, 3, 2};
        joe.printArray(myarray);
        joe.randomGenerator();
	}

}
