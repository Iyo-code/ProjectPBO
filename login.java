import java.util.Scanner;

public class Login {
    private Scanner scanner = new Scanner(System.in);

    public void proses() {
        System.out.print("Username: ");
        String user = scanner.nextLine();
        System.out.print("Password: ");
        String pass = scanner.nextLine();

        if (DataAkun.akunAdmin.containsKey(user) && DataAkun.akunAdmin.get(user).equals(pass)) {
            new MenuAdmin().tampilkan();
        } else if (DataAkun.akunCustomer.containsKey(user) && DataAkun.akunCustomer.get(user).password.equals(pass)) {
            DataAkun.currentCustomer = DataAkun.akunCustomer.get(user);
            new MenuCustomer().tampilkan();
        } else {
            System.out.println("Login gagal.");
        }
    }
}
