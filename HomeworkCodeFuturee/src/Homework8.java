public class Homework8 {
    public static void main(String[] args) {
        System.out.println(rec(5,2));
    }

    public static double rec(int degree, double num){
        if(degree == 0 ){return 1;}
        return rec(--degree,num)*num;
    }
}
