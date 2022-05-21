package week1Day2;
import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		double num1=33;
		double num2=22;
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
		switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}

		
	
