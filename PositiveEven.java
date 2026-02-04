import java.util.Scanner;

public class PositiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is positive and even");
        } else {
            System.out.println(num + " is either not positive or not even");
        }

        sc.close();
    }
}
