import java.util.Scanner;

//Ex 1.2.18
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        double dis = Math.sqrt(x*x + y*y);
        System.out.println(dis);
    }
}
