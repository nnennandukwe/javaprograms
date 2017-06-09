package summation;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int number = 1;
		// as long as number is less than 101
		while (number <= 100) {
			sum += number;
			number += 2;
		}
		System.out.println("sum of odd numbers from 1 to 100: " + sum);
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}
}
}