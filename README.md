# PBO_TUGAS-1
# PROGRAM INVESTASI SAHAM DAN SURAT BERHARGA NEGARA(SBN)

<p align="justify">
Halo! ini merupakan proyek kecil untuk melakukan investasi saham dan surat berharga negara(SBN) demi menuntaskan Tugas I PBO KAMI.

Program Java ini dirancang untuk dua jenis user dengan akses yang berbeda, yaitu:

  1. Admin diberikan akses untuk menambahkan dan mengubah harga saham, serta menambahkan surat berharga negara(SBN)
  2. Customer diberikan akses untuk membeli saham, menjual saham, membeli SBN, simulasi SBN dan melihat portofolio sendiri
     
Program ini juga dilengkapi dengan input validasi pada class inputUtil untuk memastikan pengguna memberikan input yang sesuai dengan yang dibutuhkan oleh program.

Di bawah ini adalah deskripsi program, penjelasan dari bagaimana program akan dijalankan, dan UML dari program ini. Untuk deskripsi kode lebih lengkap dapat dilihat pada kode program yang sudah dicommit sebelumnya (sudah disertakan beberapa comment untuk membantu dalam mengerti cara kerja program).
</p>

# Identitas Kami
* Nama  : I Komang Cahya Kertha Yasa
  NIM   : 2405551034
  Matkul: PBO (B)

* Nama  : I Wayan Daffa Adhirajasa
  NIM   : 2405551144
  Matkul: PBO (B)

# UML
![UML PBO](https://github.com/user-attachments/assets/b3531082-5d97-48e6-994b-5e5fb6aa081c)

# BAGAIMANA PROGRAM DIJALANKAN
Pengembangan program ini menggunakan konsep-konsep dasar dari Object Oriented Programming yaitu:

1. Penerapan Object dan Class.
2. Penggunaan Alur Kontrol (Flow Control) While loop, for each loop, if, if-else dan switch case.
3. Array list
4. Nested Class
5. Enscapsulasi
6. Interface
7. Override

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
