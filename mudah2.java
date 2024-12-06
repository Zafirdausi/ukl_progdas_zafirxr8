import java.util.Scanner;
public class mudah2 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        //input bilangan
        System.out.println("masukkan bilangan: ");
        int bilangan = z.nextInt();

        //periksa ganjil atau genap
        if (bilangan % 2 ==0){
            System.out.println("bilangan" + bilangan + "adalah bilangan genap.");
        }else {
            System.out.println("bilangan " + bilangan + "adalah bilangan ganjil");
        }
    }
    
}

