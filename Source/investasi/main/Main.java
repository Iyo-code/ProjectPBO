package investasi.main;

import investasi.model.User;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            tampilkanHeader();
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            User loginUser = login(username, password);
            if (loginUser != null) {
                if (loginUser.getRole().equals("admin")) {
                    new AdminMenu().show();
                } else {
                    new CustomerMenu(loginUser).show();
                }
            } else {
                System.out.println("Login gagal.");
            }
        }
    }

    private static void tampilkanHeader() {
        System.out.println("====================================");
        System.out.println("🟢 APLIKASI INVESTASI SEDERHANA CLI ");
        System.out.println("====================================");
    }

    private static User login(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            return new User(username, password, "admin");
        }
        if (username.equals("customer") && password.equals("cust123")) {
            return new User(username, password, "customer");
        }
        return null;
    }
}
