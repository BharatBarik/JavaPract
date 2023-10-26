import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner tempin = new Scanner(System.in);
        System.out.print("Enter Temperature in C :");
        float temp_c = tempin.nextFloat();
        float temp_f = (temp_c * 9 / 5) + 32;
        tempin.close();
        System.out.println("Temperature in F : " + temp_f);
    }

}
