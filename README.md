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
Tampilan login menampilkan dua akun akses yaitu admin dengan username admin dan password admin123 serta customer dengan username customer dan password cust123 yang ditampilkan secara terpisah agar memudahkan pengguna dalam memilih peran saat masuk ke dalam aplikasi.
</p>

# MENU ADMIN
![Menu Admin](https://github.com/user-attachments/assets/9197c579-454a-4139-b3e7-8e23e56cb7c1)


<p align="justify">
Tampilan menu admin terdiri dari tiga pilihan utama yaitu Kelola Saham untuk menambahkan atau mengubah data saham Kelola SBN untuk menambahkan surat berharga negara dan Logout untuk keluar dari sesi admin.
</p>

# MENU ADMIN KELOLA SAHAM
![Menu Admin Kelola Saham](https://github.com/user-attachments/assets/b1d5f90c-fbe9-4948-b11e-85745a0e33f4)


<p align="justify">
Tampilan menu admin kelola saham berisi tiga opsi yaitu Tambah Saham untuk memasukkan data saham baru Ubah Harga Saham untuk memperbarui harga saham yang sudah ada dan Kembali untuk kembali ke menu utama admin.
</p>

# TAMBAH SAHAM
![Tambah Saham](https://github.com/user-attachments/assets/b2f3f312-f837-43e4-859f-e863b36bc691)


<p align="justify">
Tampilan tambah saham memungkinkan admin untuk memasukkan kode saham nama perusahaan dan harga saham kemudian sistem akan menampilkan notifikasi bahwa data saham berhasil ditambahkan sebelum kembali ke menu sebelumnya.
</p>

# UBAH HARGA SAHAM
![Ubah Harga Saham](https://github.com/user-attachments/assets/287b65b3-b03b-47f4-a3b1-193d3760c634)


<p align="justify">
Tampilan ubah harga saham memungkinkan admin memilih salah satu saham dari daftar yang tersedia kemudian memasukkan harga baru yang diinginkan dan sistem akan menampilkan notifikasi bahwa harga saham berhasil diperbarui.
</p>

# MENU ADMIN KELOLA SBN
![Menu Admin Kelola SBN](https://github.com/user-attachments/assets/3cc82507-54e6-4904-8a4f-8afbd26acb63)


<p align="justify">
Tampilan kelola SBN memungkinkan admin untuk mengakses menu pengelolaan Surat Berharga Negara, di mana tersedia dua pilihan yaitu menambahkan data SBN baru atau kembali ke menu sebelumnya. Admin akan diminta memilih salah satu opsi, dan sistem akan mengeksekusi tindakan sesuai dengan pilihan yang dipilih.
</p>

# TAMBAH SBN
![Tambah SBN](https://github.com/user-attachments/assets/ff7c5ae0-3221-4153-a64b-583b5247fba4)



<p align="justify">
Tampilan tambah SBN memungkinkan admin untuk menginput data SBN baru dengan mengisi beberapa informasi seperti nama SBN, tingkat bunga, jangka waktu dalam bulan, tanggal jatuh tempo, dan kuota nasional. Setelah semua data diinputkan dengan benar, sistem akan menampilkan notifikasi bahwa SBN berhasil ditambahkan ke dalam daftar, dan meminta admin menekan ENTER untuk melanjutkan ke proses berikutnya.
</p>

# MENU CUSTOMER
![Menu Customer](https://github.com/user-attachments/assets/81445c4b-d2f7-4445-a789-31b131f6a988)


<p align="justify">
Tampilan menu customer menyediakan berbagai pilihan bagi pengguna untuk mengelola aktivitas investasinya. Dalam menu ini, customer dapat membeli saham, menjual saham, membeli SBN, melakukan simulasi investasi SBN, melihat portofolio, serta keluar dari sistem. Sistem akan meminta customer untuk memilih salah satu opsi dengan memasukkan nomor sesuai daftar yang ditampilkan.
</p>

# BELI SAHAM
![Beli Saham](https://github.com/user-attachments/assets/bb69757b-899a-488d-b15d-5fdb9a4e6560)


<p align="justify">
Tampilan beli saham memungkinkan customer memilih salah satu saham dari daftar yang tersedia berdasarkan nomor urut, lalu memasukkan jumlah lembar saham yang ingin dibeli. Setelah proses pembelian berhasil, sistem akan menampilkan notifikasi bahwa saham telah berhasil dibeli dan meminta customer menekan ENTER untuk melanjutkan.
</p>

# JUAL SAHAM
![Jual Saham](https://github.com/user-attachments/assets/23393acb-afc5-4e5f-b8a1-8af5aac16291)


<p align="justify">
Tampilan jual saham memungkinkan customer memilih saham yang dimiliki dari daftar portofolio, lalu memasukkan jumlah lembar saham yang ingin dijual. Setelah transaksi dilakukan, sistem akan menampilkan notifikasi bahwa saham telah berhasil dijual dan meminta customer menekan ENTER untuk melanjutkan proses.
</p>

# BELI SBN
![Beli SBN](https://github.com/user-attachments/assets/f3d990fa-3a05-4118-b9a8-83127e861a23)



<p align="justify">
Tampilan beli SBN memungkinkan customer memilih salah satu jenis Surat Berharga Negara dari daftar yang tersedia, kemudian memasukkan nominal pembelian yang diinginkan. Setelah proses transaksi berhasil, sistem akan menampilkan notifikasi bahwa SBN telah berhasil dibeli dan meminta customer untuk menekan ENTER guna melanjutkan ke tahap berikutnya.
</p>

# SIMULASI SBN
![Simulasi SBN](https://github.com/user-attachments/assets/b7757984-16b2-4a2d-a9ee-c6f9e612a2f8)


<p align="justify">
Tampilan simulasi SBN menampilkan hasil simulasi berdasarkan jenis Surat Berharga Negara yang telah dipilih dan nominal investasi yang dimasukkan oleh customer. Dalam tampilan ini, sistem menampilkan jenis SBN yaitu Obligasi Negara Ritel, beserta nilai investasi sebesar Rp10.000.000,00 dan estimasi kupon yang akan diterima setiap bulan sebesar Rp49.875,00.
</p>

# PORTOFOLIO
![Portofolio](https://github.com/user-attachments/assets/faecfe53-786c-4886-b116-64b8d37c891c)


<p align="justify">
Tampilan portofolio menampilkan ringkasan investasi yang dimiliki customer, terdiri dari saham dan SBN. Pada bagian saham, ditampilkan kepemilikan saham Bank Central Asia sebanyak 900 lembar dengan total nilai pasar sebesar Rp3.600.000,00. Sementara pada bagian SBN, ditampilkan investasi pada Obligasi Negara Ritel senilai Rp10.000.000,00 dengan kupon bulanan sebesar Rp49.875,00.
</p>

# LOGOUT
![Logout](https://github.com/user-attachments/assets/2615785e-0d36-46a3-9e25-5826ac173192)


<p align="justify">
Tampilan diatas merupakan tampilan setelah logout, yang dimana setelah logout pengguna akan otomatis kembali ke menu awal.
</p>
