import java.util.Arrays;
import java.util.Scanner;
public class sulit3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah element array yang diinginkan = ");
        int jumlah = in.nextInt();

        //input per nilai
        int[] array = new int[jumlah];
        System.out.println("Masukkan nilai per element = ");
        for ( int i = 0; i < jumlah; i++){
            array[i] = in.nextInt();
        }

        
        //looping untuk menghitung frekuensi semuanya data
        for ( int i = 0; i< array.length; i ++){
            //cek elemnt sudah dihitung atau tidak 
            boolean sudahDihitung = false;

            //looping untuk menghitung berapa kali suatu element muncul
            for ( int j = 0; j< i; j++){
                if (array[i] == array[j]){//mengecek apakah tiap nilai elemnt sama atau tidak
                    sudahDihitung = true;
                    break;
                }
            } 
            //jika element blm dihitung, hitung frekuensi
            if (!sudahDihitung){ // negasi untuk membalikkan tipe boolean
                int frekuensi = 0;
                for (int j = 0; j<array.length; j++){ //mengecek semua nilai 
                    if (array[i] == array[j]){ // cek pernilai sama atau tidak
                        frekuensi ++;//menambahkan frekuensi apabila ada nilai yang sama atau terduplikat
                    }
                }
                System.out.println("Element ke-" + array[i] + " muncul sebanyak " + frekuensi + " kali1");
            }
        }

    }
    
}

