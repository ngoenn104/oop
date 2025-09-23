import java.util.Scanner;

//Ex 1.2.21
public class SumOfSines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double de = sc.nextDouble();
        double rad = Math.toRadians(de);
        double sum = Math.sin(2 * rad) + Math.sin(3 * rad);
        System.out.println(sum);
    }
}
