package investasi.main;

import investasi.model.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loginError = "";

        while (true) {
            clearScreen();
            printHeader("PROGRAM INVESTASI SAHAM DAN SBN", "🟢");

            if (!loginError.isEmpty()) {
                System.out.println(loginError);
                System.out.println();
                loginError = "";
            }

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
                loginError = "❌ Login gagal: Username atau password salah!";
            }
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) System.out.println();
    }

    public static void printHeader(String title, String emoji) {
        int width = 40;
        String fullTitle = emoji + " " + title;
        int spaceTotal = width - 2 - fullTitle.length();
        int spaceLeft  = spaceTotal / 2;
        int spaceRight = spaceTotal - spaceLeft;

        System.out.println("=".repeat(width));
        System.out.print("|"
                + " ".repeat(spaceLeft)
                + fullTitle
                + " ".repeat(spaceRight)
                + "|\n");
        System.out.println("=".repeat(width));
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
