package investasi.main;
import investasi.model.Saham;
import investasi.model.SuratBerhargaNegara;
import investasi.service.AdminService;

import java.util.ArrayList;

public class AdminMenu {
    private static ArrayList<Saham> daftarSaham = new ArrayList<>();
    private static ArrayList<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    public void show() {
        AdminService service = new AdminService(daftarSaham, daftarSBN);
        service.menuAdmin();
    }

    public static ArrayList<Saham> getDaftarSaham() {
        return daftarSaham;
    }

    public static ArrayList<SuratBerhargaNegara> getDaftarSBN() {
        return daftarSBN;
    }
}
