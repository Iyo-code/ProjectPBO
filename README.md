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
![Login Admin](https://github.com/user-attachments/assets/bf869c5b-b3e7-4acb-a9e1-bbf4a138fd26)

![Login Customer](https://github.com/user-attachments/assets/33e41962-9afc-43a2-a286-2bc6765393be)


<p align="justify">
Penjelasan.
</p>

# MENU ADMIN
![Menu Admin](https://github.com/user-attachments/assets/9197c579-454a-4139-b3e7-8e23e56cb7c1)


<p align="justify">
Penjelasan.
</p>

# MENU ADMIN KELOLA SAHAM
![Menu Admin Kelola Saham](https://github.com/user-attachments/assets/b1d5f90c-fbe9-4948-b11e-85745a0e33f4)


<p align="justify">
Penjelasan.
</p>

# TAMBAH SAHAM
![Tambah Saham](https://github.com/user-attachments/assets/b2f3f312-f837-43e4-859f-e863b36bc691)


<p align="justify">
Penjelasan.
</p>

# UBAH HARGA SAHAM
![Ubah Harga Saham](https://github.com/user-attachments/assets/287b65b3-b03b-47f4-a3b1-193d3760c634)


<p align="justify">
Penjelasan.
</p>

# MENU ADMIN KELOLA SBN
![Menu Admin Kelola SBN](https://github.com/user-attachments/assets/3cc82507-54e6-4904-8a4f-8afbd26acb63)


<p align="justify">
Penjelasan.
</p>

# TAMBAH SBN
![Tambah SBN](https://github.com/user-attachments/assets/ff7c5ae0-3221-4153-a64b-583b5247fba4)



<p align="justify">
Penjelasan.
</p>

# MENU CUSTOMER
![Menu Customer](https://github.com/user-attachments/assets/81445c4b-d2f7-4445-a789-31b131f6a988)


<p align="justify">
Penjelasan.
</p>

# BELI SAHAM
![Beli Saham](https://github.com/user-attachments/assets/bb69757b-899a-488d-b15d-5fdb9a4e6560)


<p align="justify">
Penjelasan.
</p>

# JUAL SAHAM
![Jual Saham](https://github.com/user-attachments/assets/23393acb-afc5-4e5f-b8a1-8af5aac16291)


<p align="justify">
Penjelasan.
</p>

# BELI SBN
![Beli SBN](https://github.com/user-attachments/assets/59a584b8-d405-4f65-8096-a90e7298361a)


<p align="justify">
Penjelasan.
</p>

# SIMULASI SBN
![Simulasi SBN](https://github.com/user-attachments/assets/b7757984-16b2-4a2d-a9ee-c6f9e612a2f8)


<p align="justify">
Penjelasan.
</p>

# PORTOFOLIO
![Portofolio](https://github.com/user-attachments/assets/8c0117c5-1e6a-4cf8-b8a7-1c9879bd1720)


<p align="justify">
Penjelasan.
</p>

# LOGOUT
![Logout](https://github.com/user-attachments/assets/2615785e-0d36-46a3-9e25-5826ac173192)


<p align="justify">
Penjelasan.
</p>
