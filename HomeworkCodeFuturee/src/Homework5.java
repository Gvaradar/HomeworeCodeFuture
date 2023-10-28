public class Homework5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sumArr = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*900 + 100);
            System.out.println("Элемент с индексом " + i + " равен " + arr[i] );
            sumArr += arr[i];
        }
        System.out.println(" Сумма всех элементов равна " + sumArr);


    }
}
