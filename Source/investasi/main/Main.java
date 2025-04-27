package investasi.main;

import investasi.model.User;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearScreen();
            printHeader("APLIKASI INVESTASI CLI", "🟢");

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

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Tidak bisa membersihkan layar.");
        }
    }

    public static void printHeader(String title, String emoji) {
        int width = 38;
        String fullTitle = emoji + " " + title;
        int padding = (width - fullTitle.length()) / 2;
        System.out.println("=".repeat(width));
        System.out.printf("|%" + (padding + fullTitle.length()) + "s%" + (width - padding - fullTitle.length()) + "s|\n", fullTitle, "");
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
