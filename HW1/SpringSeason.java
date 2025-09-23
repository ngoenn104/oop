import java.util.Scanner;

//Ex 1.2.23
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        boolean check = (m == 3 && d >= 20 && d <= 31)
                    || (m == 4 && d >= 1 && d <= 30)
                    || (m == 5 && d >= 1 && d <= 31)
                    || (m == 6 && d >= 1 && d <= 20);
        System.out.println(check);
    }
}
