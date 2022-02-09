package HackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("================================");
		int i = 0;
		while(i<3) {
			String type = scanner.next();
			int number = scanner.nextInt();
			System.out.printf("%-15s%03d\n", type,number);
			i++;
		}
		scanner.close();
		System.out.println("================================");

	}

}
