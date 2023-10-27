import java.util.Scanner;

public class FebonachiSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the term : ");
        int term = in.nextInt();
        in.close();
        int p = 0;
        int n = 1;
        int c = 3;
        while (term >= c) {

            int temp = n + p;
            p = n;
            n = temp;
            c++;
        }
        if (term != 1) {
            System.out.print("Result : " + n);

        } else {
            System.out.print("Result: " + p);
        }

    }

}
