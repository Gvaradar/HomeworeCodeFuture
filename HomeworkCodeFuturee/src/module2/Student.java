package module2;

public class Student {
    private String name;
    private int[] grades;


    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }


    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }


    public String getName() {
        return name;
    }
}