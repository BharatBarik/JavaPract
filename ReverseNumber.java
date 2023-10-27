import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number to be reversed : ");
        int num = in.nextInt();
        in.close();
        int result = 0;
        while (num > 0) {
            int temp = num % 10;
            result = result * 10 + temp;
            num /= 10;
        }
        System.out.println("Result : " + result);
    }

}
