import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        byte age = scanner.nextByte();
        System.out.println("Введите ваш вес: ");
        short weight = scanner.nextShort();
        System.out.println("Введите ваш рост в см: ");
        int height = scanner.nextInt();
        System.out.println("Введите любое число : ");
        long num = scanner.nextLong();
        System.out.println("Введите ваш пол М или Ж : ");
        char sex = scanner.next().charAt(0);
        System.out.println("Вы состоите в браке? введите true если да, false если нет ");
        boolean married = scanner.nextBoolean();
        System.out.println("Введите любое десятичное число");
        double numDouble = scanner.nextDouble();
        System.out.println("Введите любое десятичное число");
        float numFloat = scanner.nextFloat();

        System.out.println();
        System.out.println("Вы ввели следующие значения  и типы : ");
        System.out.println("String " + name);
        System.out.println("byte " + age);
        System.out.println("short " + weight);
        System.out.println("int " + height);
        System.out.println("long " + num);
        System.out.println("char " + sex);
        System.out.println("boolean "+ married);
        System.out.println("double " + numDouble);
        System.out.println("float " + numFloat);
    }
}
