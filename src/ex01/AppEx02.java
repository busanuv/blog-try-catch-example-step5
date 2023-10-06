package ex01;

public class AppEx02 {
    public static void main(String[] args) {
        int num = 10;
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("괜찮아");
        }
    }
}
