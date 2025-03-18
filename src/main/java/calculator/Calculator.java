package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputCalc();
    }
    public static void inputCalc() {
        int num1, num2;
        String Operator;
        Scanner scn = new Scanner(System.in);
        Scanner operator = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        num1 = scn.nextInt();
        System.out.print("Введіть дію(+,-,*,/): ");
        Operator = operator.nextLine();
        System.out.print("Введіть друге число: ");
        num2 = scn.nextInt();
        System.out.println(num1 + " " + Operator + " " + num2 + " = " + doCalc(num1, Operator, num2));
    }
    public static int doCalc(int num1, String operator, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if(num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Помилка, ділення на 0!");
                }
            default:
                System.out.println("Помилка, невідомий оператор!");
                return 0;
        }
    }
}
