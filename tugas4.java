public class tugas4 {
    public static void main(String[] args) {
        char[] huruf = new char[15];
        char hrf = 'A';
        for (int i= 0; i < huruf.length; i++){
            huruf[i] = hrf;
            hrf++;
        }
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(huruf[index]);
                index++;
            }
            System.out.println();
        }
    }
}
