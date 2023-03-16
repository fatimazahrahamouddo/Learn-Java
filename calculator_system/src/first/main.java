package first;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);	 
	String num1,num2,operator; 
	int num1Int,num2Int,num3;
		try {
			System.out.print("Enter the first number : ");
			num1 = Input.nextLine();
			num1Int = Integer.parseInt(num1); 
			System.out.print("Enter the operator : ");
			operator = Input.nextLine();
			System.out.print("Enter the second number : ");
			num2 = Input.nextLine();
			num2Int = Integer.parseInt(num2);
			//start condition
			if(operator.equals("+") ) {
				num3 = num1Int + num2Int;
				System.out.print(num1Int + "+" + num2Int + "=" + num3);
			}else if(operator.equals("-")) {
				num3 = num1Int - num2Int;
				System.out.print(num1Int + "-" + num2Int + "=" + num3);
			}else if(operator.equals("*")) {
				num3 = num1Int * num2Int;
				System.out.print(num1Int + "*" + num2Int + "=" + num3);
			}else if(operator.equals("/")) {
				num3 = num1Int / num2Int;
				System.out.print(num1Int + "/" + num2Int + "=" + num3);
			}else {
				System.out.print("Enter a correct operator");
			}
			//end condition
			
		
		}catch(Exception e) {
			System.out.print("The error is : "+e);
		}
	}
}

