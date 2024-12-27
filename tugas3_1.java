import java.util.Scanner;
public class tugas3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        boolean Prima = true;
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt(); 
        if (bilangan <= 1) {
            Prima = false;
        } else {
            for (int i = 2; i * i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    Prima = false;
                    break;
                }
            }
        }
        if (Prima) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
    }
}