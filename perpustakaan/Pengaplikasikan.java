package perpustakaan;

import java.util.Scanner;
public class Pengaplikasikan {
    public static void main(String[] args) {
       Scanner myObj = new Scanner(System.in);
       
       Peminjaman pj = new Peminjaman();
       Buku bk = new Buku();
       Siswa sw = new Siswa();
       Petugas pt = new Petugas();
       Laporan lp = new Laporan();
       
       System.out.println("Selamat datang di Perpustakaan");
       System.out.println("Ketik 1 untuk menampilkan tabel siswa");
       System.out.println("Ketik 2 untuk menampilkan tabel buku");
       System.out.println("Ketik 3 untuk meminjam/mengembalikan buku");
       System.out.println("Ketik 4 untuk menampilkan laporan peminjaman");
       System.out.println("Ketik 0 untuk keluar dari program");
       
       int pilih;
       do{
           System.out.print("Ketikkan angka untuk memilih opsi : ");
           pilih = myObj.nextInt();
           if (pilih == 1){
               lp.laporan(sw);
           } else if (pilih == 2){
               lp.laporan(bk);
           } else if (pilih == 3){
               pj.Peminjaman(sw, pt, bk, lp, pj);
           } else if (pilih == 4){
               lp.laporan(pj, bk);
               lp.laporan(sw);
               lp.laporan(bk);
           }
       } while (pilih != 0);
}
}
