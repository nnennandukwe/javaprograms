package basicjava;

import java.util.*;

public class Primes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer, please: ");
		int userInput = scanner.nextInt();
		System.out.println("The user entered " + userInput);
		
		// prime number is divisible by the number itself and 1
		int potentialFactor = 2;
		while (userInput % potentialFactor != 0) {
			potentialFactor++; // increments potential factor
		}
		if (potentialFactor == userInput) {
			System.out.println("The number is prime!");
		}
		else {
			System.out.println("The number is not prime. The factor is: " + potentialFactor);
		}
		boolean b = true && true;
		System.out.println(b);
	}

}
