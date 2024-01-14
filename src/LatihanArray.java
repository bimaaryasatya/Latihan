import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan Jumlah Data Yang Akan Diinput = ");
        int jumlah_data= Integer.parseInt(reader.readLine());                   //konversi int ke string (angka ke kalimat)
        String[] judul_buku = new String[jumlah_data];                          // mempersiapkan array untuk menampung data sebanyak jumlah_data
        for(int index=0; index<jumlah_data;index++){                            //mengulang inputan sebanyak jumlah_data atau dari index 0 sampai jumlah_data-1
            System.out.println("Input Judul Buku ke - " + (index+1) + " : ");
            String judul = reader.readLine();                                   // menampung inputan dari user
            judul_buku [index] = judul;                                          // memasukkan judul ke dalam keranjang judul_buku yang ke index
        }
    }
}
