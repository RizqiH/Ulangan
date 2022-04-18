
public class soal4 {
 
    public static void main(String[] args) {
 
        int angka[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
        System.out.println("\t Ganjil & Genap Array \n");
 
        System.out.print("\n Genap : ");
        for (int i = 0; i < 10; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + ", ");
 
            }
        }
 
        System.out.print("\n Ganjil : ");
        for (int j = 0; j < 10; j++) {
            if (angka[j] % 2 != 0) {
                System.out.print(angka[j] + ", ");
            }
        }
    }
}