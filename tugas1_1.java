import java.util.Scanner;
public class tugas1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PERHITUNGAN SUHU ===");
        int suhu;
        double hasil;
        System.out.print("Masukkan suhu (dalam celcius): ");
        suhu = sc.nextInt();
        hasil = ((suhu * 9) / 5 ) + 32;
        System.out.println("Hasil konversi ke fahreinhet : " + hasil + " f");
    }
}