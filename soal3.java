import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        try (Scanner keyboard = new Scanner(System.in)) {
                System.out.print("Input angka-1: ");
                angka1 = keyboard.nextInt();
                System.out.print("Input angka-2: ");
                angka2 = keyboard.nextInt();
                
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);

                System.out.print("Input angka-1: ");
                angka1 = keyboard.nextInt();
                System.out.print("Input angka-2: ");
                angka2 = keyboard.nextInt();
        }
    }
}