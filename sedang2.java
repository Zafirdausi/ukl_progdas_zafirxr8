import java.util.Scanner;
public class sedang2 {
    public static void main(String[] args) {
        
    
            Scanner scanner = new Scanner(System.in);
    
            // Meminta input dari pengguna
            System.out.print("Masukkan jari-jari tabung (r): ");
            double jariJari = scanner.nextDouble();
    
            System.out.print("Masukkan tinggi tabung (t): ");
            double tinggi = scanner.nextDouble();
    
            // Memanggil fungsi untuk menghitung volume tabung
            double volume = hitungVolumeTabung(jariJari, tinggi);
            double luas = luaslingkaran(jariJari);

            // Menampilkan hasil
            System.out.println("Volume tabung adalah: " + volume);
    
            System.out.println("Luas lingkaran adalah:");

            scanner.close();
        }
    
        // Fungsi untuk menghitung volume tabung
        public static double hitungVolumeTabung(double r, double t) {
            double phi = 3.14; // Nilai π dari pustaka Math
        double volume = phi * r * r * t; // Rumus volume tabung
        return volume;
        }
        public static double luaslingkaran(double luas){
            double phi = 3.14;
            double luas = phi*r*r*t;

        }
    }
    
    

