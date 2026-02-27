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
            if (jk.equalsIgnoreCase("Pria")) {
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

        DataDosen25 data = new DataDosen25();
        data.jumlahDosenPerJenisKelamin(daftarDosen25);
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen25);
        data.infoDosenPalingTua(daftarDosen25);
        data.infoDosenPalingMuda(daftarDosen25);
        data.dataSemuaDosen(daftarDosen25);
        }
    }

