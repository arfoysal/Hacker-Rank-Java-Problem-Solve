package HackerRank;

import java.util.Scanner;

public class JavaStdinandStdoutOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int thirdNumber = scanner.nextInt();
		scanner.close();

		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);

	}

}
