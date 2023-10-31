import java.util.Scanner;

public class Login {
    public void verify() {
        Scanner sc = new Scanner(System.in);
        boolean login = true;
        while (login) {
            int accountNumber;
            int pin;
            System.out.println("Enter Account Number:");
            accountNumber = sc.nextInt();
            System.out.println("Enter Pin:");
            pin = sc.nextInt();
            if (accountNumber == 1 && pin == 1) {
                login = false;
                System.out.println("successfully login into your account");
            } else {
                System.out.println("Failed to login please enter correct AccountNumber and pin!");
            }
        }
    }
}
