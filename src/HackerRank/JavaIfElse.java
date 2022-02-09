package HackerRank;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 != 0)
            System.out.println("Weird");
        else if (n < 6)
            System.out.println("Not Weird");
        else if (n <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

	}

}
