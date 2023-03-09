package HomeWork_1;

/*Вывести все простые числа от 1 до 1000*/

import java.util.Scanner;
public class exe2 {
    public static void main(String [] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число:  ");
        int number = iScanner.nextInt();
        for(int i = 2; i < number; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;
              }
            }
            if(count<2)
               System.out.println(i);
          }
    }
}
    