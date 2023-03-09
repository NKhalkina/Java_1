package HomeWork_1;

/*Реализовать простой калькулятор (+ - / *)
*Ввод числа ->
*Ввод знака ->
*Ввод числа -> */

import java.util.Scanner;
public class exe3 {
    public static void main(String [] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double num1 = iScanner.nextDouble();
        double num2 = iScanner.nextDouble();
        System.out.println("Введите операцию (+, -, *, /): ");
        String x = iScanner.next();
        char oper;
        oper = x.charAt(0);

        if (oper == '+') {
            System.out.print(num1 + num2);
        }else if (oper == '-'){
            System.out.print(num1 - num2);
        }else if (oper == '*'){
            System.out.print(num1 * num2);
        }else if (oper == '/'){
            System.out.print(num1 / num2);
        }
    }
}