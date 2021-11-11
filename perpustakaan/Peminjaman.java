package perpustakaan;
import java.util.ArrayList;
import java.util.Scanner;
public class Peminjaman {
    ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    ArrayList<Integer> idBuku = new ArrayList<Integer>();
    ArrayList<Integer> banyakBuku = new ArrayList<Integer>();
    
    Scanner input = new Scanner(System.in);
    
    public void Peminjaman(Siswa siswa, Petugas petugas, Buku buku, Laporan laporan, Peminjaman tr){
        
        System.out.print("Masukkan id siswa : ");
        int idSiswaInput = input.nextInt();
        
        do{
            if (siswa.getStatus(idSiswaInput) == true) {
                System.out.println("Halo " + siswa.getNama(idSiswaInput) + " status anda adalah true. Anda boleh memiinjam buku");
                laporan.laporan(buku);

                System.out.print("Masukkan id buku yang ingin anda pinjam : ");
                int idBukuPinjam = input.nextInt();

                System.out.print("Masukkan jumlah buku yang ingin anda pinjam : ");
                int banyakBukuPinjam = input.nextInt();

                updateDataPinjam(buku, idSiswaInput, idBukuPinjam, banyakBukuPinjam, siswa);
                
                System.out.println("Berikut detail peminjaman buku");
                System.out.println("Nama \tJudul \tJumlah \tPetugas \tStatus");
                
                int x = tr.getJmlPeminjaman();
                for(int i = 0; i < x; i++){
                    System.out.println(siswa.getNama(tr.getIdSiswa(i)) + "\t" + buku.getNamaBuku(tr.getIdBuku(i)) + "\t" + tr.getBanyakBuku(i) + "\t" + petugas.getNama(i) +"\t"+ siswa.getStatus(tr.getIdSiswa(i)));
                }
            } else {
                System.out.println("Halo " + siswa.getNama(idSiswaInput) + " status anda adalah false. Anda harus mengembalikan buku terlebih dahulu.");
                laporan.laporan(buku);
                
                System.out.print("Masukkan id buku yang ingin anda kembalikan : ");
                int idBukuReturn = input.nextInt();

                System.out.print("Masukkan jumlah buku yang ingin anda kembalikan : ");
                int banyakBukuReturn = input.nextInt();
                
                siswa.editStatus(idSiswaInput, true);
                buku.editStok(idBukuReturn, buku.getStok(idBukuReturn) + banyakBukuReturn);
            }
        } while(siswa.getStatus(idSiswaInput) == true);
        
    }
    
    public void updateDataPinjam(Buku buku, int idSiswa, int idBuku, int banyakBuku, Siswa siswa){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyakBuku.add(banyakBuku);
        
        //edit stok buku
        buku.editStok(idBuku, buku.getStok(idBuku) - banyakBuku);
        //edit status siswa
        siswa.editStatus(idSiswa, false);
    }
    
    //method size
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
    
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    
    public int getBanyakBuku(int id){
        return this.banyakBuku.get(id);
    }
}

    
    

