package firstquiz;

public class Problem2 {

	public static void main(String[] args) {
		// PROBLEM 2
		int n = 93;
		double d = 1.27;
		double result = n - d;
		if (result > 0) {
			boolean b = result < 0;
			if (b) {
				System.out.println("This can not be true!");
			}
		}
		else {
			String s = "wow!";
			if (result >=0) {
				s = "bravo!";
				System.out.println(s);
			} else {
				System.out.println(s);
			}
		}
		// PROBLEM 5
		int j = 0;
		for (int i = 0; i < 93; i++) {
			j = i + 1;
		}
		int i = j;
		System.out.println(i);
	}

}
