package investasi.service;

import investasi.model.Saham;
import investasi.model.SuratBerhargaNegara;
import investasi.model.User;

import java.util.*;
import static investasi.main.Main.clearScreen;
import static investasi.main.Main.printHeader;

public class CustomerService {
    private User user;
    private ArrayList<Saham> daftarSaham;
    private ArrayList<SuratBerhargaNegara> daftarSBN;
    private Scanner scanner;

    private Map<Saham, Integer> sahamDimiliki = new HashMap<>();
    private Map<SuratBerhargaNegara, Double> sbnDimiliki = new HashMap<>();

    public CustomerService(User user, ArrayList<Saham> daftarSaham, ArrayList<SuratBerhargaNegara> daftarSBN) {
        this.user = user;
        this.daftarSaham = daftarSaham;
        this.daftarSBN = daftarSBN;
        this.scanner = new Scanner(System.in);
    }

    public void menuCustomer() {
        boolean ulang = true;
        while (ulang) {
            clearScreen();
            printHeader("MENU CUSTOMER", "👤");

            System.out.println("1. Beli Saham");
            System.out.println("2. Jual Saham");
            System.out.println("3. Beli SBN");
            System.out.println("4. Simulasi SBN");
            System.out.println("5. Portofolio");
            System.out.println("6. Logout");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1: beliSaham(); break;
                case 2: jualSaham(); break;
                case 3: beliSBN(); break;
                case 4: simulasiSBN(); break;
                case 5: tampilkanPortofolio(); break;
                case 6:
                    ulang = false;
                    clearScreen();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void beliSaham() {
        if (daftarSaham.isEmpty()) {
            System.out.println("Belum ada saham tersedia.");
            return;
        }

        System.out.println("=== Daftar Saham ===");
        for (int i = 0; i < daftarSaham.size(); i++) {
            System.out.println((i + 1) + ". " + daftarSaham.get(i));
        }

        System.out.print("Pilih saham: ");
        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= daftarSaham.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Saham sahamDipilih = daftarSaham.get(index);
        System.out.print("Jumlah lembar: ");
        int jumlah = scanner.nextInt();

        sahamDimiliki.put(sahamDipilih, sahamDimiliki.getOrDefault(sahamDipilih, 0) + jumlah);
        System.out.println("✅ Saham berhasil dibeli.");
    }

    private void jualSaham() {
        if (sahamDimiliki.isEmpty()) {
            System.out.println("Anda belum memiliki saham.");
            return;
        }

        List<Saham> sahamList = new ArrayList<>(sahamDimiliki.keySet());
        System.out.println("=== Saham Dimiliki ===");
        for (int i = 0; i < sahamList.size(); i++) {
            Saham s = sahamList.get(i);
            System.out.printf("%d. %s - %d lembar%n", i + 1, s.getNamaPerusahaan(), sahamDimiliki.get(s));
        }

        System.out.print("Pilih saham yang ingin dijual: ");
        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= sahamList.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Saham saham = sahamList.get(index);
        System.out.print("Jumlah lembar yang dijual: ");
        int jumlah = scanner.nextInt();

        int jumlahDimiliki = sahamDimiliki.get(saham);
        if (jumlah > jumlahDimiliki) {
            System.out.println("❌ Jumlah lembar melebihi yang dimiliki.");
        } else {
            if (jumlah == jumlahDimiliki) {
                sahamDimiliki.remove(saham);
            } else {
                sahamDimiliki.put(saham, jumlahDimiliki - jumlah);
            }
            System.out.println("✅ Saham berhasil dijual.");
        }
    }

    private void beliSBN() {
        if (daftarSBN.isEmpty()) {
            System.out.println("Belum ada SBN tersedia.");
            return;
        }

        System.out.println("=== Daftar SBN ===");
        for (int i = 0; i < daftarSBN.size(); i++) {
            System.out.println((i + 1) + ". " + daftarSBN.get(i));
        }

        System.out.print("Pilih SBN: ");
        int index = scanner.nextInt() - 1;
        if (index < 0 || index >= daftarSBN.size()) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        SuratBerhargaNegara sbn = daftarSBN.get(index);
        System.out.print("Nominal pembelian: Rp");
        double nominal = scanner.nextDouble();

        if (nominal > sbn.getKuotaNasional()) {
            System.out.println("❌ Kuota nasional tidak mencukupi.");
            return;
        }

        sbn.kurangiKuota(nominal);
        sbnDimiliki.put(sbn, sbnDimiliki.getOrDefault(sbn, 0.0) + nominal);
        System.out.println("✅ SBN berhasil dibeli.");
    }

    private void simulasiSBN() {
        if (sbnDimiliki.isEmpty()) {
            System.out.println("Belum memiliki SBN.");
            return;
        }

        System.out.println("=== Simulasi Kupon SBN per Bulan ===");
        for (Map.Entry<SuratBerhargaNegara, Double> entry : sbnDimiliki.entrySet()) {
            SuratBerhargaNegara sbn = entry.getKey();
            double nominal = entry.getValue();
            double kupon = (sbn.getBunga() / 100 / 12) * 0.9 * nominal;

            System.out.printf("%s | Investasi: Rp%.2f | Kupon/bulan: Rp%.2f%n",
                    sbn.getNama(), nominal, kupon);
        }
    }

    private void tampilkanPortofolio() {
        System.out.println("\n=== PORTOFOLIO INVESTASI ===");

        System.out.println(">> Saham:");
        double totalNilaiPasar = 0;
        for (Map.Entry<Saham, Integer> entry : sahamDimiliki.entrySet()) {
            Saham saham = entry.getKey();
            int jumlah = entry.getValue();
            double harga = saham.getHarga();
            double nilai = jumlah * harga;
            totalNilaiPasar += nilai;
            System.out.printf("%s - %d lembar | Harga: Rp%.2f | Total: Rp%.2f%n",
                    saham.getNamaPerusahaan(), jumlah, harga, nilai);
        }
        System.out.printf("Total Nilai Pasar Saham: Rp%.2f%n", totalNilaiPasar);

        System.out.println("\n>> SBN:");
        double totalKupon = 0;
        for (Map.Entry<SuratBerhargaNegara, Double> entry : sbnDimiliki.entrySet()) {
            SuratBerhargaNegara sbn = entry.getKey();
            double nominal = entry.getValue();
            double kupon = (sbn.getBunga() / 100 / 12) * 0.9 * nominal;
            totalKupon += kupon;
            System.out.printf("%s | Nominal: Rp%.2f | Kupon/bulan: Rp%.2f%n",
                    sbn.getNama(), nominal, kupon);
        }
        System.out.printf("Total Kupon/bulan: Rp%.2f%n", totalKupon);
    }
}
