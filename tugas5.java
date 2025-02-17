import java.util.Scanner;
public class tugas5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namaMahasiswa = new String[3];
        double[][] nilaiMahasiswa = new double[3][5];
        double totalSemuaNilai = 0;
        int totalJumlahNilai = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc.nextLine();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = sc.nextDouble();
                totalSemuaNilai += nilaiMahasiswa[i][j];
                totalJumlahNilai++;
            }
            sc.nextLine();
        }
        System.out.println("\nRata-rata nilai per mahasiswa:");
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += nilaiMahasiswa[i][j];
            }
            double rataRata = total / 5;
            System.out.println(namaMahasiswa[i] + " : " + rataRata);
        }
        double rataRataKeseluruhan = totalSemuaNilai / totalJumlahNilai;
        System.out.print("\nRata-rata keseluruhan mahasiswa: " + rataRataKeseluruhan);
        sc.close();
    }
} 