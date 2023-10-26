import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        System.out.print("Enter Principal Amount: ");
        Scanner sin = new Scanner(System.in);
        float p = sin.nextFloat();
        System.out.print("Enter Rate of intrest: ");
        float r = sin.nextFloat();
        System.out.print("Enter Time period in Years: ");
        float t = sin.nextFloat();
        float result;
        result = (p * r * t) / 100;
        System.out.println("Intrest to be paid is : " + result);
        System.out.print("Total Amount : " + (p + result));

        sin.close();

    }
}