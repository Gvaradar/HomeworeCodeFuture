package module2;

public class Main {
    public static void main(String[] args) {

        int[] studentGrades = {85, 90, 78, 92, 88};
        Student student = new Student("Иван", studentGrades);


        double averageGrade = student.calculateAverageGrade();
        System.out.println("Средний балл студента " + student.getName() + ": " + averageGrade);
    }
}
