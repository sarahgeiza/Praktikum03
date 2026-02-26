import java.util.Scanner;
public class MatakuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah25[] arrayOfMatakuliah25 = new Matakuliah25[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Daata Matakuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");

            arrayOfMatakuliah25[i] = new  Matakuliah25(kode, nama, sks, jumlahJam);
            
            arrayOfMatakuliah25[i].tambahData(kode, nama, sks, jumlahJam);
    
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah25[i].cetakInfo();
        }
    }
}
