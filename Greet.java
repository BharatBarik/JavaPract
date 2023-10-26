import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner name = new Scanner(System.in);

        String nam = name.next();

        System.out.println("Hello!! " + nam);

        name.close();

    }

}