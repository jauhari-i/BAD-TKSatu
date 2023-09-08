import java.util.Scanner;

public class NumberOne {
  public static void main(String[] args) {
    boolean ulang;
    Scanner scanner = new Scanner(System.in);

    do {
      // Membaca input dari pengguna
      System.out.print("Masukkan String A: ");
      String stringA = scanner.nextLine();
      System.out.print("Masukkan String B: ");
      String stringB = scanner.nextLine();

      // Menampilkan menu pilihan
      System.out.println("Pilih fungsi yang ingin digunakan:");
      System.out.println("1. Mengubah huruf kecil menjadi huruf besar dan huruf besar menjadi huruf kecil");
      System.out.println("2. Menghitung jumlah huruf (tidak termasuk spasi)");
      System.out.println("3. Menggabungkan String A dan String B dengan menyisipkan tanda koma dan spasi");
      System.out.println("4. Membalik String A dan String B");

      // Membaca pilihan pengguna
      int choice = 0;
      boolean validChoice = false;
      do {
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        if (scanner.hasNextInt()) {
          choice = scanner.nextInt();
          if (choice >= 1 && choice <= 4) {
            validChoice = true;
          } else {
            System.out.println("Pilihan tidak valid. Harap masukkan pilihan yang benar.");
          }
        } else {
          System.out.println("Pilihan tidak valid. Harap masukkan pilihan yang benar.");
          scanner.next(); // Mengonsumsi masukan yang salah
        }
      } while (!validChoice);

      // Memproses pilihan pengguna
      switch (choice) {
        case 1:
          // Mengubah huruf kecil menjadi huruf besar dan huruf besar menjadi huruf kecil
          stringA = swapCase(stringA);
          stringB = swapCase(stringB);
          break;
        case 2:
          // Menghitung jumlah huruf (tidak termasuk spasi)
          int jumlahHurufA = countLetters(stringA);
          int jumlahHurufB = countLetters(stringB);
          System.out.println("Jumlah huruf String A: " + jumlahHurufA);
          System.out.println("Jumlah huruf String B: " + jumlahHurufB);
          break;
        case 3:
          // Menggabungkan String A dan String B dengan menyisipkan tanda koma dan spasi
          String hasilPenggabungan = stringA + ", " + stringB;
          System.out.println("Hasil penggabungan: " + hasilPenggabungan);
          break;
        case 4:
          // Membalik String A dan String B
          stringA = reverseString(stringA);
          stringB = reverseString(stringB);
          break;
      }

      // Output hasil manipulasi
      System.out.println("String A: " + stringA);
      System.out.println("String B: " + stringB);

      // Meminta pengguna apakah ingin mengulang
      scanner.nextLine(); // Mengonsumsi karakter newline
      System.out.print("Apakah Anda ingin mengulang? (ya/tidak): ");
      String ulangInput = scanner.nextLine().toLowerCase();
      ulang = ulangInput.equals("ya");
    } while (ulang);

    scanner.close();
  }

  // Fungsi untuk mengubah huruf kecil menjadi huruf besar dan huruf besar menjadi
  // huruf kecil
  public static String swapCase(String input) {
    char[] charArray = input.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      char c = charArray[i];
      if (Character.isUpperCase(c)) {
        charArray[i] = Character.toLowerCase(c);
      } else {
        charArray[i] = Character.toUpperCase(c);
      }
    }
    return new String(charArray);
  }

  // Fungsi untuk menghitung jumlah huruf (tidak termasuk spasi)
  public static int countLetters(String input) {
    int count = 0;
    for (char c : input.toCharArray()) {
      if (Character.isLetter(c)) {
        count++;
      }
    }
    return count;
  }

  // Fungsi untuk membalikkan sebuah string
  public static String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
  }
}
