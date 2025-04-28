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
![pbo](https://github.com/user-attachments/assets/81e2be72-85f5-443c-81c4-1fa541019048)

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
Program Investasi Saham dan SBN diatas menyediakan dua jenis akun, yaitu admin dan customer, masing-masing dengan username dan password yang sudah ditentukan (admin/admin123 untuk admin dan customer/cust123 untuk customer). Admin kemungkinan memiliki hak akses untuk mengelola data investasi, pengguna, dan pengaturan sistem, sedangkan customer hanya memiliki akses untuk melakukan investasi dan melihat portofolio mereka. 
</p>

# MENU ADMIN
![Menu Admin](https://github.com/user-attachments/assets/9197c579-454a-4139-b3e7-8e23e56cb7c1)


<p align="justify">
Program Investasi Saham dan SBN diatas, admin diberikan tiga pilihan utama, yaitu Kelola Saham, Kelola SBN, dan Logout. Menu ini dibuat dengan tampilan sederhana menggunakan garis ASCII sebagai pembatas agar terlihat lebih rapi dan terstruktur. Fitur "Kelola Saham" memungkinkan admin untuk mengatur data terkait investasi saham, "Kelola SBN" untuk mengatur investasi Surat Berharga Negara, sedangkan opsi "Logout" digunakan untuk keluar dari sistem dan mengakhiri sesi admin. 
</p>

# MENU ADMIN KELOLA SAHAM
![Menu Admin Kelola Saham](https://github.com/user-attachments/assets/b1d5f90c-fbe9-4948-b11e-85745a0e33f4)


<p align="justify">
menampilkan tampilan Menu Kelola Saham dalam program berbasis teks, yang merupakan bagian dari fitur admin di Program Investasi Saham dan SBN. Menu ini menawarkan tiga opsi utama kepada admin, yaitu Tambah Saham untuk menambahkan data saham baru ke dalam sistem, Ubah Harga Saham untuk memperbarui harga saham yang sudah ada, dan Kembali untuk kembali ke menu admin utama. Tata letak menu dibuat menggunakan garis ASCII sebagai pemisah, membuat tampilannya lebih terstruktur dan mudah dipahami
</p>

# TAMBAH SAHAM
![Tambah Saham](https://github.com/user-attachments/assets/b2f3f312-f837-43e4-859f-e863b36bc691)


<p align="justify">
Admin memilih opsi Tambah Saham (pilihan 1), lalu mengisi detail saham seperti Kode Saham (BBCA), Nama Perusahaan (Bank Central Asia), dan Harga Saham (3500). Setelah data dimasukkan, sistem menampilkan notifikasi dengan tanda centang hijau yang menyatakan bahwa "Saham berhasil ditambahkan!" sebagai tanda bahwa proses input berjalan sukses. Di bagian bawah, terdapat instruksi untuk menekan ENTER guna melanjutkan ke proses atau menu berikutnya, mempertahankan interaksi berbasis teks yang sederhana dan terarah.
</p>

# UBAH HARGA SAHAM
![Ubah Harga Saham](https://github.com/user-attachments/assets/287b65b3-b03b-47f4-a3b1-193d3760c634)


<p align="justify">
Admin memilih opsi Ubah Harga Saham (pilihan 2). Sistem kemudian menampilkan daftar saham yang tersedia, salah satunya adalah BBCA - Bank Central Asia dengan harga awal Rp3500.00. Admin memilih saham yang ingin diubah (pilihan 1) dan memasukkan harga baru sebesar 4000. Setelah itu, sistem memberikan konfirmasi dengan tanda centang hijau yang menyatakan bahwa "Harga saham diperbarui!", diikuti instruksi untuk menekan ENTER agar melanjutkan ke tahap berikutnya.
</p>

# MENU ADMIN KELOLA SBN
![Menu Admin Kelola SBN](https://github.com/user-attachments/assets/3cc82507-54e6-4904-8a4f-8afbd26acb63)


<p align="justify">
Menu ini menawarkan dua pilihan utama, yaitu Tambah SBN untuk menambahkan data SBN baru ke dalam sistem, dan Kembali untuk kembali ke menu admin utama. Desain menu menggunakan format berbasis teks dengan garis-garis ASCII sebagai pembatas untuk menjaga kerapihan tampilan, sementara di bagian bawah terdapat prompt "Pilih:" yang menunggu input pilihan dari admin untuk menentukan langkah selanjutnya.
</p>

# TAMBAH SBN
![Tambah SBN](https://github.com/user-attachments/assets/ff7c5ae0-3221-4153-a64b-583b5247fba4)



<p align="justify">
Admin memilih opsi Tambah SBN (pilihan 1) lalu mengisi data penting seperti Nama SBN (Obligasi Negara Ritel), Bunga (%) (6.65), Jangka Waktu (36 bulan), Tanggal Jatuh Tempo (2025-10-15), dan Kuota Nasional (10000000000000). Setelah semua data diinput, sistem mengonfirmasi bahwa SBN berhasil ditambahkan dengan tanda centang hijau, serta menampilkan pesan untuk menekan ENTER agar dapat melanjutkan ke proses berikutnya. Tampilan ini menggunakan format teks sederhana dengan pembatas ASCII agar tetap terstruktur dan mudah dibaca.
</p>

# MENU CUSTOMER
![Menu Customer](https://github.com/user-attachments/assets/81445c4b-d2f7-4445-a789-31b131f6a988)


<p align="justify">
Menu ini menawarkan beberapa pilihan kepada pengguna, yaitu: membeli saham, menjual saham, membeli Surat Berharga Negara (SBN), melakukan simulasi investasi SBN, melihat portofolio investasi, dan logout dari akun.
</p>

# BELI SAHAM
![Beli Saham](https://github.com/user-attachments/assets/bb69757b-899a-488d-b15d-5fdb9a4e6560)


<p align="justify">
Gambar di atas menunjukkan tampilan antarmuka teks untuk fitur Beli Saham dalam sebuah aplikasi investasi. Di sini, tersedia opsi untuk membeli saham BBCA (Bank Central Asia) dengan harga Rp4000,00 per lembar. Pengguna diminta memilih saham dengan memasukkan angka pilihan (dalam contoh ini "1") dan menentukan jumlah lembar yang ingin dibeli (sebanyak "1000" lembar). Setelah input dilakukan, sistem menampilkan notifikasi sukses yang ditandai dengan ikon centang dan pesan "Saham berhasil dibeli." Terakhir, pengguna diarahkan untuk menekan ENTER guna melanjutkan ke proses berikutnya.
</p>

# JUAL SAHAM
![Jual Saham](https://github.com/user-attachments/assets/23393acb-afc5-4e5f-b8a1-8af5aac16291)


<p align="justify">
Gambar di atas menampilkan antarmuka teks untuk fitur Jual Saham dalam sebuah aplikasi investasi. Pada tampilan ini, pengguna memiliki saham Bank Central Asia sebanyak 1000 lembar, dan diminta untuk memilih saham yang ingin dijual dengan memasukkan nomor pilihan ("1") serta menentukan jumlah lembar yang akan dijual (sebanyak "100" lembar). Setelah transaksi dikonfirmasi, sistem menampilkan pesan sukses "Saham berhasil dijual." dengan ikon centang hijau. Proses ini diakhiri dengan instruksi untuk menekan ENTER agar pengguna dapat melanjutkan.
</p>

# BELI SBN
![Beli SBN](https://github.com/user-attachments/assets/f3d990fa-3a05-4118-b9a8-83127e861a23)



<p align="justify">
menampilkan antarmuka berbasis teks untuk fitur Beli SBN (Surat Berharga Negara) dalam sebuah aplikasi keuangan. Di sini tersedia satu produk, yaitu Obligasi Negara Ritel dengan bunga sebesar 6,65% dan kuota pembelian yang sangat besar. Pengguna diminta memilih produk SBN dengan memasukkan angka pilihan ("1") dan menentukan nominal pembelian (sebesar Rp10.000.000 dalam contoh ini). Setelah pembelian berhasil, sistem memberikan notifikasi sukses "SBN berhasil dibeli." lengkap dengan ikon centang hijau, lalu meminta pengguna untuk menekan ENTER agar bisa melanjutkan.
</p>

# SIMULASI SBN
![Simulasi SBN](https://github.com/user-attachments/assets/b7757984-16b2-4a2d-a9ee-c6f9e612a2f8)


<p align="justify">
Simulasi ini menampilkan hasil estimasi pendapatan dari investasi di Obligasi Negara Ritel dengan nilai investasi sebesar Rp10.000.000,00. Berdasarkan simulasi, investor akan menerima kupon bulanan sebesar Rp49.875,00. Setelah informasi ditampilkan, sistem meminta pengguna untuk menekan ENTER agar dapat melanjutkan ke tahap berikutnya.
</p>

# PORTOFOLIO
![Portofolio](https://github.com/user-attachments/assets/faecfe53-786c-4886-b116-64b8d37c891c)


<p align="justify">
Dalam portofolio ini, pengguna memiliki saham Bank Central Asia sebanyak 900 lembar dengan harga per lembar Rp4000,00, sehingga total nilai pasar saham mencapai Rp3.600.000,00. Selain saham, pengguna juga memiliki investasi di Obligasi Negara Ritel dengan nominal Rp10.000.000,00 yang menghasilkan kupon bulanan sebesar Rp49.875,00. Seluruh informasi ringkas ini membantu pengguna memantau nilai investasinya secara langsung sebelum diarahkan untuk menekan ENTER guna melanjutkan.
</p>

# LOGOUT
![Logout](https://github.com/user-attachments/assets/2615785e-0d36-46a3-9e25-5826ac173192)


<p align="justify">
Gambar diatas merupakan tampilan setelah logout, yang dimana setelah logout pengguna akan otomatis kembali ke menu awal.
</p>
