import java.util.Scanner;

public class PasswordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (password.length() >= 8) {
            System.out.println("Password is valid (length OK)");
        } else {
            System.out.println("Password too short! Minimum 8 characters");
        }

        sc.close();
    }
}
