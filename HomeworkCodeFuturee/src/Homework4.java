import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();
        System.out.println("Введите чторое число ");
        int b = scanner.nextInt();
        int sum=0;
        for (int i = a; i <=b ; i++) {
            sum+=i;
        }
        System.out.println("Сумма всех чисел между " + a + " и " + b +  " равна: " + sum);
    }

}
