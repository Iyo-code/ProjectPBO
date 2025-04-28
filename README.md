# PBO_TUGAS1
# PROGRAM INVESTASI SAHAM DAN SURAT BERHARGA NEGARA(SBN)

<p align="justify">
Aplikasi ini dibuat untuk memenuhi Tugas 1 Pemrograman Berorientasi Objek (PBO) dengan konsep investasi sederhana.

Dalam program ini dirancang untuk dua jenis user dengan akses yang berbeda, yaitu:

* Admin dapat mengelola daftar Saham dan Surat Berharga Negara (SBN), termasuk menambahkan data baru dan mengubah harga saham.
* Customer digambarkan sebagai investor, dengan fitur untuk membeli saham, menjual saham, membeli SBN, melakukan simulasi kupon, dan melihat portofolio investasi yang dimiliki.
     
Seluruh interaksi pengguna dilakukan melalui tampilan terminal/console, dengan desain antarmuka sederhana namun terstruktur (menggunakan header dan clear screen setiap navigasi).

Program dilengkapi dengan sistem validasi input pada setiap form isian untuk mencegah kesalahan input dan menjaga konsistensi data.

Struktur program memanfaatkan prinsip OOP (Object-Oriented Programming) sepenuhnya, seperti enkapsulasi data dalam model, pemisahan antara layanan service untuk admin dan customer, serta penggunaan class khusus untuk keperluan menu navigasi.

Untuk deskripsi kode lebih rinci, sudah disediakan komentar pada setiap bagian penting kode.
</p>

# Struktur Project
* ├── investasi/
    * ├── main/
    * │   ├── Main.java
    * │   ├── AdminMenu.java
    * │   └── CustomerMenu.java
    * ├── service/
    * │   ├── AdminService.java
    * │   └── CustomerService.java
    * ├── model/
    * │   ├── User.java
    * │   ├── Saham.java
    * │   └── SuratBerhargaNegara.java

# Indentitas Pemilik
* Trio Suro Wibowo (2405551168)
* I Made Agus Hendra Diwangga (2405551155)

# UML
![UML PBO]()

# FITUR UTAMA
* Admin :
    * Tambah Saham baru
    * Ubah Harga Saham
    * Tambah Surat Berharga Negara (SBN)

* Customer :
    * Beli Saham
    * Jual Saham
    * Beli SBN
    * Simulasi Kupon SBN
    * Melihat Portofolio Saham dan SBN

# BAGAIMANA PROGRAM DIJALANKAN
Pengembangan program ini menggunakan konsep-konsep dasar dari Object Oriented Programming yaitu:

1. Penerapan Object dan Class pada semua komponen seperti Saham, SBN, User, AdminService, dan CustomerService.
2. Penggunaan Alur Kontrol (Flow Control) seperti while loop untuk navigasi menu, for-each loop untuk menampilkan daftar, if-else untuk validasi, dan switch-case untuk pilihan menu.
3. Penggunaan ArrayList untuk menyimpan data dinamis Saham dan Surat Berharga Negara.
4. Implementasi relasi antar class (association, dependency, aggregation) antara AdminService, CustomerService, Saham, SBN, dan User.
5. Penerapan Encapsulation dengan penggunaan modifier akses private pada atribut dan public pada method accessor.
6. Penggunaan Override pada method-method penting seperti menu navigasi.
7. Desain program modular dengan pemisahan menu, service, dan model.

# PENGGUNAAN PROGRAM
Di bawah ini adalah contoh implementasi program investasi saham dan surat berharga negara (SBN) lengkap dengan hasil tangkapan layar. Penjelasan mengenai cara kerja kode dapat ditemukan di bawah ini.

# LOGIN PAGE
![Login Page](https://github.com/user-attachments/assets/947fa72f-c141-42b9-87a7-31e6e116187c)
![Login Admin](https://github.com/user-attachments/assets/41bf7d13-a3e5-4be5-bbeb-c06f4729c78c)
![Login Customer](https://github.com/user-attachments/assets/3a345ce9-646a-466a-a818-289fa93c524c)

<p align="justify">
Setelah user memilih melaukan login, user akan diminta untuk menginputkan username dan password meereka. Jika benar maka akan mengeluarkan output seperti gambar di atas, bila salah maka user akan keluar perintah untuk memberikan user dan password yang benar lalu user kembali diminta untuk memilih login atau keluar, seperti gambar di atas.
</p>

# MENU ADMIN
![Menu Admin](https://github.com/user-attachments/assets/d129c818-3b94-40be-a2b6-b1743b88ef47)

<p align="justify">
Setelah melakukan login sebagai administrator, maka user akan diberi intruksi pada menu admin seperti gambar di atas. Admin akan diminta untuk memilih opsi di atas dengan menginputkan angka
</p>

# MENU ADMIN SAHAM
![Menu Admin Saham](https://github.com/user-attachments/assets/41e04ed5-6997-4177-9f87-04df7249c1d5)

<p align="justify">
Jika admin memilih Saham pada menu admin, maka administrator akan diberi instruksi pada menu admin Saham sperti gambar di atas. Admin akan diminta untuk memilih opsi di atas dengan menginputkan angka
</p>

# TAMBAH SAHAM
![Menu Tambah Saham Admin](https://github.com/user-attachments/assets/de64c833-f4d5-42f9-b3fc-2f8179abc80b)

<p align="justify">
Admin bisa menambahkan saham dengan menambahkan kode saham, nama perusahaan dan Harga saham pada gamba di atas. Jika berhasil menambahkan, maka akan terdapat pesan seperti gambar di atas
</p>

# UBAH HARGA SAHAM
![Menu Ubah Harga Saham Admin](https://github.com/user-attachments/assets/3c493754-a19b-479a-ac74-d22b66791ee5)

<p align="justify">
Admin bisa mengubah harga saham dari list daftar saham yang sudah ada pada gambar di atas. Setelah memilih saham yang ada, admin perlu menginput harga saham yang baru. Jika berhasil mengubah, maka akan terdapat pesan seperti gambar di atas
</p>

# MENU ADMIN SBN
![Menu Admin SBN](https://github.com/user-attachments/assets/f120378e-e612-4964-923c-a134d6fa3f9f)

<p align="justify">
Jika admin memilih Saham pada menu admin, maka administrator akan diberi instruksi pada menu admin Saham sperti gambar di atas. Admin akan diminta untuk memilih opsi di atas dengan menginputkan angka
</p>

# TAMBAH SBN
![Menu Tambah SBN Admin](https://github.com/user-attachments/assets/40548281-91f1-41ea-8f08-14f04ff3def6)

<p align="justify">
Admin bisa menambahkan SBN dengan menginput nama SBN, bunga per tahun, jangka wakktu, jatuh tempo dan kuota nasional seperti pada gambar di atas. Jika berhasil menambahkan, maka akan terdapat pesan seperti gambar di atas
</p>

# MENU CUSTOMER
![Customer Menu](https://github.com/user-attachments/assets/3269f691-3971-4914-bf8b-71926b8260c9)

<p align="justify">
Setelah melakukan login sebagai customer, maka user akan diberi instruksi pada menu customer seperti gambar di atas. Customer akan diminta untuk memilih opsi di atas dengan menginputkan angka
</p>

# BELI SAHAM
![Beli Saham](https://github.com/user-attachments/assets/d431c1d9-4d18-4870-b0de-95647a3301e9)

<p align="justify">
Customer bisa membeli saham dari list daftar saham yang tersedia seperti pada gambar di atas. Setelah memilih saham yang ingin dibeli, customer perlu memilih jumlah lembar yang ingin dibeli.  Jika berhasil membeli, maka akan terdapat pesan seperti gambar di atas
</p>

# JUAL SAHAM
![Jual Saham](https://github.com/user-attachments/assets/03456afc-a152-4622-9608-26002e56b970)

<p align="justify">
Customer bisa menjual saham dari list daftar saham yang customer punya. Setelah memilih saham yang ingin dijual, customer perlu memilih jumlah lembar yang ingin dijual. Jika berhasil menjual, maka akan terdapat pesan seperti gambar di atas
</p>

# BELI SBN
![Beli SBN](https://github.com/user-attachments/assets/8864f174-b708-458f-ad2f-b0d8add24965)

<p align="justify">
Customer bisa membeli SBN dari list daftar SBN yang tersedia seperti pada gambar di atas. Setelah memilih SBN yang ingin dibeli, customer perlu menginput nominal pembelian yang ingin dibeli.  Jika berhasil membeli, maka akan terdapat pesan seperti gambar di atas
</p>

# SIMULASI SBN
![Simulasi SBN](https://github.com/user-attachments/assets/acc63edb-a31c-44f2-b44e-467d6a021626)

<p align="justify">
Customer bisa melakukan simulasi SBN dari list daftar yang tersedia seperti pada gambar di atas. Setelah memilih SBN yang ingin disimulasi, customer perlu menginput nominal investasi yang diinginkan. Jika berhasil, maka akan terdapat hasil simulasi seperti gambar di atas
</p>

# PORTOFOLIO
![Portofolio](https://github.com/user-attachments/assets/12e74918-10b7-4e06-b741-6edb0b6a5056)

<p align="justify">
Customer bisa melihat portofolionya sendiri seperti pada  gambar di atas. Terdapat daftar saham yang berisi total nilai pasar saham dan total pembelian saham. Serta, daftar SBN yang berisi total bunga bulanan yang sedang  dimiliki customer sekarang
</p>

# LOGOUT
![Keluar Program](https://github.com/user-attachments/assets/f89e1277-01fc-4a3a-94c6-34cdb6488053)
![Logout Admin](https://github.com/user-attachments/assets/474fe8bc-cca3-455d-b73b-485c29774636)
![Logout Customer](https://github.com/user-attachments/assets/19073b3f-a667-4a02-a5b7-d78fb2742606)

<p align="justify">
Setelah user memilih untuk melakukan logout maupun keluar dari program. Maka, program akan mengeluarka pesan seperti gambar di atas
</p>
