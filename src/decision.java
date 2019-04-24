import java.util.Scanner;

public class decision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String answer = "y";
		String name;

		int num;

		System.out.println("enter your name: ");
		name = scan.nextLine();
		do {
			System.out.print("" + name + ", enter an integer (1-100): ");

			while (scan.hasNextInt() == false) {
				String input = scan.next();
				System.out.println("you entered: " + input);
				System.out.println("please enter a valid number" + " ");
			}
			num = scan.nextInt();

			while (num < 1 || num > 100) {
				System.out.println("you entered: " + num);
				System.out.println("please enter a number between 1-100" + " ");

				while (scan.hasNextInt() == false) {
					String input = scan.next(); //
					System.out.println("you entered: " + input);
					System.out.println("please enter a valid number" + " ");
				}

				num = scan.nextInt();
			}

			int odd;
			odd = num % 2;
			if (odd == 1 && num < 61) {
				System.out.println(num + ": odd");
			}
			if (odd == 1 && num > 60) {
				System.out.println(num + ": odd and over 60");
			}
			if (odd == 0) {
				if (num < 25) {
					System.out.println(num + ": even and less than 25");
				} else if (num < 61) {
					System.out.println(num + ": even");
				} else {
					System.out.println(num + ": even and over 60");

				}
			}
			System.out.println("Continue? (y/n)");
			answer = scan.next();

		} while (answer.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}
}
