import java.util.Scanner;
public class tugas2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int air, bayar;
        System.out.print("Masukkan kubik air : ");
        air = sc.nextInt();
        if (air <= 50) {
            bayar = air * 1000;
        }else if (air <= 100) {
            bayar = (50 * 1000) + ((air - 50) * 1500);
        }else if (air <= 150) {
            bayar = (50 * 1000) + (100 * 1500) + ((air - 100) * 2000);
        }else {
            bayar = (50 * 1000) + (100 * 1500) + (150 * 2000) + ((air - 150) * 3000);
        }
        System.out.println("Biaya yang harus di keluarkan : " + bayar);
    }
}