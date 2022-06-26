package Fundamentals.Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = mathOperation(firstNumber,operator,secondNumber);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double mathOperation (double firstNum, char operation, double secondNum){
double result = 0;
        switch (operation){
            case '/':
                result = firstNum/secondNum;
                break;
            case '*':
                result = firstNum*secondNum;
                break;
            case '+':
                result = firstNum+secondNum;
                break;
            case '-':
                result = firstNum-secondNum;
                break;
        }
        return result;
    }
}
