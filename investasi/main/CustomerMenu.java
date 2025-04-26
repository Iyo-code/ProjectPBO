package investasi.main;

import investasi.model.User;
import investasi.service.CustomerService;

public class CustomerMenu {
    private User user;

    public CustomerMenu(User user) {
        this.user = user;
    }

    public void show() {
        CustomerService service = new CustomerService(
                user,
                AdminMenu.getDaftarSaham(),
                AdminMenu.getDaftarSBN()
        );
        service.menuCustomer();
    }
}