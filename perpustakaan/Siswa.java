package perpustakaan;

import java.util.ArrayList;
public class Siswa implements User{
    private ArrayList<String> namaSiswa = new ArrayList<String>(); //enkap adalah pembungkus/menyembunyikan dr kelas lain
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa(){
        this.namaSiswa.add("Arum"); //this utk menyatakan variabel di dlm class
        this.alamat.add("singosari");
        this.telepon.add("08129879");
        this.status.add(false);

        this.namaSiswa.add("Dina");
        this.alamat.add("kromengan");
        this.telepon.add("08187798");
        this.status.add(true);
    }
    
    public void setStatus(boolean status) { //mengisi data
        this.status.add(status);
    }
    
    public boolean getStatus(int idSiswa) { //mengambil data
        return this.status.get(idSiswa);
    }
    public void editStatus(int idStatus, boolean status) {
       this.status.set(idStatus, status);;
    }

    public int getJmlSiswa() {
        return this.namaSiswa.size();
    }

    @Override // menggunakan nama yang sama, tapi beda arti
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }
    // polimor=> kemampuan untuk menghasilkan aksi yang berbeda saat memanggil method yang sama
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
}
