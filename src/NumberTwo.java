import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah bilangan = ");
        int jumlahBilangan = input.nextInt();

        int[] bilangan = new int[jumlahBilangan];

        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " = ");
            bilangan[i] = input.nextInt();
        }

        int min = bilangan[0];
        int max = bilangan[0];
        int total = bilangan[0];

        for (int i = 1; i < jumlahBilangan; i++) {
            if (bilangan[i] < min) {
                min = bilangan[i];
            }

            if (bilangan[i] > max) {
                max = bilangan[i];
            }

            total += bilangan[i];
        }

        double rataRata = (double) total / jumlahBilangan;

        System.out.println("Bilangan terkecil = " + min);
        System.out.println("Bilangan terbesar = " + max);
        System.out.println("Nilai rata-rata = " + rataRata);

        input.close();
    }
}
