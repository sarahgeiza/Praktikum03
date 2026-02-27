import java.util.Scanner;
public class DosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen25[] daftarDosen25 = new Dosen25[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i+1));

            System.out.print("Kode            : ");
            String kode = sc.nextLine();

            System.out.print("Nama            : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin   : ");
            String jk = sc.nextLine();

            Boolean jenisKelamin;
            if (jk.equalsIgnoreCase("P")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }

            System.out.print("Usia            : ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen25[i] = new Dosen25(kode, nama, jenisKelamin, usia);
        }

        System.out.println("-------------------------------------");

        int no = 1;
        for (Dosen25 dsn : daftarDosen25) {
            System.out.println("Data Dosen ke-" + no++);
            dsn.tampilkanData();
        }
    }
}
