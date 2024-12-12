import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nPilih opsi:");
            System.out.println("1. Cek bilangan prima");
            System.out.println("2. Hitung KPK");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan (1-3): ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    // Cek bilangan prima
                    System.out.print("Masukkan sebuah bilangan untuk cek prima: ");
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " adalah bilangan prima.");
                    } else {
                        System.out.println(num + " bukan bilangan prima.");
                    }
                    break;
                case 2:
                    // Hitung KPK
                    System.out.print("Masukkan bilangan pertama: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Masukkan bilangan kedua: ");
                    int num2 = scanner.nextInt();
                    int lcm = findLCM(num1, num2);
                    System.out.println("KPK dari " + num1 + " dan " + num2 + " adalah: " + lcm);
                    break;
                case 3:
                    // Keluar dari program
                    System.out.println("Keluar dari program. Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    // Metode untuk menentukan apakah sebuah bilangan prima
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Bilangan <= 1 bukan prima
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Jika ada pembagi selain 1 dan n
            }
        }
        return true;
    }
    // Metode untuk menghitung KPK (Kelipatan Persekutuan Terkecil)
    public static int findLCM(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; // KPK ditemukan
            }
            max++;
        }
    }
}