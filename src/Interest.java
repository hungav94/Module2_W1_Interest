import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money: ");
        double money = scanner.nextDouble();
        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        double interest = 0;
        interest = money * rate / 100 / 12 * month;
        System.out.println("interest: " + interest);
    }
}
