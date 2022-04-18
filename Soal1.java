import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1, num2;
            System.out.print("Masukkan Bilangan Pertama: ");
            num1 = input.nextInt();
            System.out.print("Masukkan Bilangan Kedua: ");
            num2 = input.nextInt();
            if (num1 >= num2) {
                System.out.println(num1 + " Lebih besar daripada " + num2);
            } else {
                System.out.println(num2 + " Lebih besar daripada " + num1);
            }
        }
    }
}