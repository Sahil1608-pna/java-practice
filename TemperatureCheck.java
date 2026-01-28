import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (°C): ");
        double temp = sc.nextDouble();

        if (temp <= 0) {
            System.out.println("Freezing");
        } else if (temp <= 10) {
            System.out.println("Very Cold");
        } else if (temp <= 20) {
            System.out.println("Cold");
        } else if (temp <= 30) {
            System.out.println("Normal");
        } else if (temp <= 40) {
            System.out.println("Hot");
        } else {
            System.out.println("Very Hot");
        }

        sc.close();
    }
}
