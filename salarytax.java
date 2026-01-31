import java.util.Scanner;

public class salarytax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual salary (₹): ");
        double salary = sc.nextDouble();

        double tax = 0;

        if (salary > 1000000) {
            tax += (salary - 1000000) * 0.30;
            salary = 1000000;
        }
        if (salary > 500000) {
            tax += (salary - 500000) * 0.20;
            salary = 500000;
        }
        if (salary > 250000) {
            tax += (salary - 250000) * 0.05;
        }

        System.out.printf("Tax to pay: ₹%.2f\n", tax);

        sc.close();
    }
}
