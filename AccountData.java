import java.util.*;

public class AccountData {
    public static Map<String, String> adminAccounts = new HashMap<>();
    public static Map<String, Customer> customerAccounts = new HashMap<>();
    public static List<Stock> stockList = new ArrayList<>();
    public static List<GovernmentBond> bondList = new ArrayList<>();
    public static Customer currentCustomer = null;

    public static void initialize() {
        adminAccounts.put("admin", "admin123");
        customerAccounts.put("user1", new Customer("user1", "pass1"));
    }
}