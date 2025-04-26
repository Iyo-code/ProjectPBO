package investasi.model;

import java.time.LocalDate;

public class SuratBerhargaNegara {
    private String nama;
    private double bunga;
    private int jangkaWaktu;
    private LocalDate jatuhTempo;
    private double kuotaNasional;

    public SuratBerhargaNegara(String nama, double bunga, int jangkaWaktu, LocalDate jatuhTempo, double kuotaNasional) {
        this.nama = nama;
        this.bunga = bunga;
        this.jangkaWaktu = jangkaWaktu;
        this.jatuhTempo = jatuhTempo;
        this.kuotaNasional = kuotaNasional;
    }

    public String getNama() { return nama; }
    public double getBunga() { return bunga; }
    public int getJangkaWaktu() { return jangkaWaktu; }
    public LocalDate getJatuhTempo() { return jatuhTempo; }
    public double getKuotaNasional() { return kuotaNasional; }
    public void kurangiKuota(double nominal) { this.kuotaNasional -= nominal; }

    @Override
    public String toString() {
        return String.format("%s | Bunga: %.2f%% | Kuota: Rp%.2f", nama, bunga, kuotaNasional);
    }
}
