import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите год для проверки на високостность: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + " является високсным годом");
        }else{
            System.out.println(year + " Не является високсным годом");
        }

    }
}
