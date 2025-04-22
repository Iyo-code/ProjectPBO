import java.util.*;

public class Main {
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        AccountData.initialize();
        while (true) {
            System.out.println("\nMain Menu\n1. Login\n2. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) new Login().process();
            else break;
        }
    }
}