package investasi.service;

import investasi.model.Saham;
import investasi.model.SuratBerhargaNegara;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static investasi.main.Main.clearScreen;
import static investasi.main.Main.printHeader;

public class AdminService {
    private ArrayList<Saham> daftarSaham;
    private ArrayList<SuratBerhargaNegara> daftarSBN;
    private Scanner scanner;

    public AdminService(ArrayList<Saham> daftarSaham, ArrayList<SuratBerhargaNegara> daftarSBN) {
        this.daftarSaham = daftarSaham;
        this.daftarSBN = daftarSBN;
        this.scanner = new Scanner(System.in);
    }

    public void menuAdmin() {
        boolean running = true;
        while (running) {
            clearScreen();
            printHeader("MENU ADMIN", "🧑‍💼");

            System.out.println("1. Kelola Saham");
            System.out.println("2. Kelola SBN");
            System.out.println("3. Logout");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    kelolaSaham();
                    break;
                case 2:
                    kelolaSBN();
                    break;
                case 3:
                    running = false;
                    clearScreen();
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid.");
                    pause();
            }
        }
    }

    private void kelolaSaham() {
        boolean ulang = true;
        while (ulang) {
            clearScreen();
            printHeader("KELOLA SAHAM", "📈");

            System.out.println("1. Tambah Saham");
            System.out.println("2. Ubah Harga Saham");
            System.out.println("3. Kembali");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahSaham();
                    break;
                case 2:
                    ubahHargaSaham();
                    break;
                case 3:
                    ulang = false;
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid.");
                    pause();
            }
        }
    }

    private void tambahSaham() {
        System.out.print("Kode Saham: ");
        String kode = scanner.nextLine();
        System.out.print("Nama Perusahaan: ");
        String nama = scanner.nextLine();
        System.out.print("Harga Saham: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        daftarSaham.add(new Saham(kode, nama, harga));
        System.out.println("✅ Saham berhasil ditambahkan!");
        pause();
    }

    private void ubahHargaSaham() {
        if (daftarSaham.isEmpty()) {
            System.out.println("Belum ada saham.");
            pause();
            return;
        }

        System.out.println("Daftar Saham:");
        for (int i = 0; i < daftarSaham.size(); i++) {
            System.out.println((i + 1) + ". " + daftarSaham.get(i));
        }

        System.out.print("Pilih saham: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index >= 0 && index < daftarSaham.size()) {
            System.out.print("Harga baru: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();

            daftarSaham.get(index).setHarga(harga);
            System.out.println("✅ Harga saham diperbarui!");
        } else {
            System.out.println("❌ Pilihan tidak valid.");
        }
        pause();
    }

    private void kelolaSBN() {
        boolean ulang = true;
        while (ulang) {
            clearScreen();
            printHeader("KELOLA SBN", "🏦");

            System.out.println("1. Tambah SBN");
            System.out.println("2. Kembali");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahSBN();
                    break;
                case 2:
                    ulang = false;
                    break;
                default:
                    System.out.println("❌ Pilihan tidak valid.");
                    pause();
            }
        }
    }

    private void tambahSBN() {
        System.out.print("Nama SBN: ");
        String nama = scanner.nextLine();
        System.out.print("Bunga (%): ");
        double bunga = scanner.nextDouble();
        System.out.print("Jangka Waktu (bulan): ");
        int jangkaWaktu = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tanggal Jatuh Tempo (YYYY-MM-DD): ");
        LocalDate jatuhTempo = LocalDate.parse(scanner.nextLine());
        System.out.print("Kuota Nasional: ");
        double kuota = scanner.nextDouble();
        scanner.nextLine();

        daftarSBN.add(new SuratBerhargaNegara(nama, bunga, jangkaWaktu, jatuhTempo, kuota));
        System.out.println("✅ SBN berhasil ditambahkan!");
        pause();
    }

    private void pause() {
        System.out.println("\nTekan ENTER untuk melanjutkan...");
        scanner.nextLine();
    }
}
