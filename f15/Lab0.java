// Lab0.java
// Alan Jamieson
// September 11, 2015
// Solution for Lab 0, Fall 2015

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Lab0 {

	//add3Integers method - return the sum of three
	//integer parameters a, b, c
	public int add3Integers(int a, int b, int c){
		return a+b+c;
	}
	
	//IterativeFib - calculate and print the Fibonacci sequence
	//from element 0 to element n (passed via int parameter)
	public void IterativeFib(int n){
		int a = 0;
		int b = 1;
		int temp = 0;
		
		//catch in case only one element needed
		if (n == 0){
			System.out.println(n);
			return;
		}
		
		//loop in order to print all elements, generating the sequence as we go
		for (int i = 1; i<=n; i++){
			System.out.println(a);
			temp = a+b;
			a = b;
			b = temp;
		}
	}
	
	//RecursiveFib - Recursive fib entry method. Takes in the n for the sequence, catches
	//the base case, or sends along to the private helper method for the print
	//and calculation
	public void RecursiveFib(int n){
		if (n == 0){
			System.out.println(n);
			return;
		}
		FibHelper(0,1,n);
	}
	
	//FibHelper - Recursive fib helper method. Uses a and b ints to hold the values as we
	//are doing the calculation, and n as a counter to know how many we need
	//to print.
	private void FibHelper(int a, int b, int n){
		//base case - return if counter is 0
		if (n == 0)
			return;
		else{
			System.out.println(a);
			//recursive call, does the actual calculation, decrementing the counter
			//on subsequent calls.
			FibHelper(b, a+b, n-1);
		}
	}
	
	//intFile - method to pull in a file that has integers, one per line, called ints.txt
	//prints each integer in the file in binary, octal, and hex
	public void intFile(){
		//get the file object
		
		File f = new File("/Users/Alan/Desktop/ints.txt");
		Scanner s;
		
		//try-catch to open the file and do the scanning
		try {
			s = new Scanner(f);
			
			//loop structure to do the prints
			while (s.hasNext()){
				//need a long since there's a big number in ints.txt
				long number = s.nextLong();
				System.out.println(Long.toBinaryString(number));
				System.out.printf("%o\n", number);
				System.out.printf("%x\n", number);
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//arrayStats - get a bunch of numbers from the user, print the highest,
	//lowest, mean, median of those numbers
	public void arrayStats(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of numbers: ");
		int size = s.nextInt();
		//create my array
		int a[] = new int[size];
		//sum variable to do the sum as we go for average
		int sum = 0;
		
		//simple for loop to get the numbers from the user, summing as we go
		for(int i = 0; i<size; i++){
			a[i] = s.nextInt();
			sum += a[i];
		}
		
		//sort to make highest and lowest easy
		Arrays.sort(a);
		System.out.println("Highest: " + a[size-1]);
		System.out.println("Lowest: " + a[0]);
		System.out.println("Median: " + a[size/2]);
		//this will be a mean that is an integer rather than a float, this is ok, but can be fixed
		//by casting the variables as a float
		System.out.println("Mean: " + sum/size);
		
	}
	
	public static void main(String[] args) {
		Lab0 l = new Lab0();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Lab 0 Menu ***");
		System.out.println("1. Add3Ints");
		System.out.println("2. Iterative Fib");
		System.out.println("3. Recursive Fib");
		System.out.println("4. intFile");
		System.out.println("5. arrayStats");
		System.out.println("0. Exit");
		System.out.println("*******************");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		while (choice != 0){
			switch(choice){
				case 1:
					System.out.println("Enter 3 ints");
					int one = scan.nextInt();
					int two = scan.nextInt();
					int three = scan.nextInt();
					System.out.println("Sum: " + l.add3Integers(one, two, three));
					break;
				case 2:
					System.out.print("Enter number to generate: ");
					int count = scan.nextInt();
					l.IterativeFib(count);
					break;
				case 3:
					System.out.print("Enter number to generate: ");
					int k = scan.nextInt();
					l.RecursiveFib(k);
					break;
				case 4:
					l.intFile();
					break;
				case 5:
					l.arrayStats();
					break;
				case 0:
					return;
				default:
			}
			System.out.println("*** Lab 0 Menu ***");
			System.out.println("1. Add3Ints");
			System.out.println("2. Iterative Fib");
			System.out.println("3. Recursive Fib");
			System.out.println("4. intFile");
			System.out.println("5. arrayStats");
			System.out.println("0. Exit");
			System.out.println("*******************");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
		}
		
		//close the scanner, which will close System.in as well, negating the
		//resource leak warning in arrayStats()
		scan.close();
	}

}
