import java.util.Scanner;
public class tugas3_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = sc.nextInt();
        int a = bilangan1;
        int b = bilangan2;
        while (b != 0) {
            int angka = b;
            b = a % b;
            a = angka;
        }
        int fpb = a;
        int kpk = (bilangan1 * bilangan2) / fpb;
        System.out.println("KPK dari " + bilangan1 + " dan " + bilangan2 + " adalah " + kpk);
    }
}