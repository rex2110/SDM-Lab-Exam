import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Please enter 2 numbers: ");
			int a = scanner.nextInt();
			int b= scanner.nextInt();
			
			System.out.println("Sum of two numbers ("+a+"+"+b+") = "+(a+b));
		}

	}

}