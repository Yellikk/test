import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {
        int a, b, sum;
        Scanner in = new Scanner(System.in);

        System.out.println("Vvedite 2 chisla");

        a = Integer.valueOf(in.next());
        b = Integer.valueOf(in.next());
        sum = a + b;

        System.out.println(sum);

    }
}
