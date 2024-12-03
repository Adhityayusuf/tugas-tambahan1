import java.util.Scanner;
public class tugas1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan input (detik) : ");
        int input = sc.nextInt();

        int jam = input / 3600;
        int menit = (input % 3600) / 60;
        int detik = input % 60;
        System.out.println();
        System.out.println("jam\t:\tmenit\t:\tdetik");
        System.out.println(jam + "\t:\t" + menit + "\t:\t" + detik);
    }
}