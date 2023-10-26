import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        Scanner num = new Scanner(System.in);
        int value = num.nextInt();
        num.close();
        for (int i = 1; i != 11; i++) {
            System.out.println(value + " x " + i + " = " + (value * i));
        }
    }

}
