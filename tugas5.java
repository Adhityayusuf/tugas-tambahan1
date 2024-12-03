import java.util.Scanner;
public class tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namaMahasiswa = new String[3];
        double[][] nilaiMahasiswa = new double[3][5];
        double totalSemuaNilai = 0;
        int totalJumlahNilai = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextDouble();
                totalSemuaNilai += nilaiMahasiswa[i][j];
                totalJumlahNilai++;
            }
            scanner.nextLine();
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
        System.out.printf("\nRata-rata keseluruhan mahasiswa: %.2f%n", rataRataKeseluruhan);
        scanner.close();
    }
}