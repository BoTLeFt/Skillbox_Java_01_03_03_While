import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretPinCode = 1234; // insecure
        int pinCode = -1;
        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Input your PIN-code:");
            }
            else {
                System.out.println("Your PIN-code is incorrect, Please try again:");
            }
            pinCode = new Scanner(System.in).nextInt();
        }

        System.out.println("Your PIN-code is correct");
    }
}