package multiplication_system;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int num = Input.nextInt();
		for(int i = 1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

}
