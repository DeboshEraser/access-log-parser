import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber+secondNumber;
        int difference = firstNumber-secondNumber;
        int multiply = firstNumber*secondNumber;
        double quotient = (double)firstNumber/secondNumber;

        System.out.println("Сумма чисел "+firstNumber+" и "+secondNumber+" равна "+sum);
        System.out.println("Разность чисел "+firstNumber+" и "+secondNumber+" равна "+difference);
        System.out.println("Произведение чисел "+firstNumber+" и "+secondNumber+" равно "+multiply);
        System.out.println("Частное чисел "+firstNumber+" и "+secondNumber+" равно "+quotient);
    }
}
