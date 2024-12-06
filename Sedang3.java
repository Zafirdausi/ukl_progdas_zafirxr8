import java.util.Scanner;

public class Sedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueQuiz = true;

        // Pertanyaan diatur secara manual
        int[][] pertanyaan = {
            {2, 3, '*'}, // 2 * 3
            {10, 2, '/'},// 10 / 2
            {7, 4, '%'}, // 7 % 4
            {5, 5, '*'}, // 5 * 5
            {12, 3, '/'},// 12 / 3
            {24, 4, '/'},// 24 / 4
        };

        int currentQuestion = 0; // Pertanyaan saat ini

        while (continueQuiz) {
            // Ambil bilangan pertama, kedua, dan operator
            int bilangan1 = pertanyaan[currentQuestion][0];
            int bilangan2 = pertanyaan[currentQuestion][1];
            char operator = (char) pertanyaan[currentQuestion][2];

            // Hitung jawaban benar 
            int jawabanBenar = 0;
            switch (operator) {
                case '*':
                    jawabanBenar = bilangan1 * bilangan2;
                    break;
                case '/':
                    jawabanBenar = bilangan1 / bilangan2; // Asumsikan bilangan2 != 0
                    break;
                case '%':
                    jawabanBenar = bilangan1 % bilangan2;
                    break;
            }

            // Tampilkan pertanyaan
            System.out.print("Apa hasil dari: " + bilangan1 + " " + operator + " " + bilangan2 + " = ");
            int jawabanUser = scanner.nextInt();

            // Periksa jawaban user
            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah! Jawaban yang benar adalah: " + jawabanBenar);
            }

            // Tanyakan apakah ingin melanjutkan kuis
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            String lanjut = scanner.next();
            if (lanjut.equalsIgnoreCase("n")) {
                continueQuiz = false;
            } else {
                // Pindah ke pertanyaan berikutnya, kembali ke awal jika habis
                currentQuestion = (currentQuestion + 1) % pertanyaan.length;
            }
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
        scanner.close();
    }
}