package perpustakaan;
public interface User { 
//menggunakan interface karena pada kelas induk,hanya mengandung method tanpa implementeasi yg dimana akan di implementasikan pada subclass
//yang juga menggunakan pembungkus private, yg dimana private hanya dapat diakses pada kelas itu sendiri
//nilai abstract yang masih kosong
 public void setNama(String nama);
 public void setAlamat(String alamat);
 public void setTelepon(String telepon);

 public String getNama(int id);
 public String getAlamat(int id);
 public String getTelepon(int id);
}