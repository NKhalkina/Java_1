package HomeWork_1;

/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
*Ввод:5
*Треугольное число 1 + 2 + 3 + 4 + 5 = 15
n! 1 * 2 * 3 * 4 * 5 = 120 */
import java.util.Scanner;
public class exe1 {
    public static void main(String [] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int number = iScanner.nextInt();
        int summ=0;
        int temp=1;
        for (int i = 1; i <= number; i++) {
            summ=summ+i;
            temp=temp*i;
        }

        System.out.printf("Сумма всех чисел в диапазоне от 1 до %d : %d \n", number, summ);
        System.out.printf("Факториал числа %d : %d \n",number, temp);
        iScanner.close();
   
    }
}
