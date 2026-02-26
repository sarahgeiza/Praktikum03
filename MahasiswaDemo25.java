import java.util.Scanner;
public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa25[] arrayOfMahasiswa25 = new Mahasiswa25[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa25[i] = new Mahasiswa25();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");   
            arrayOfMahasiswa25[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa25[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa25[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa25[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : "+ arrayOfMahasiswa25[i].nim);
            System.out.println("Nama    : "+ arrayOfMahasiswa25[i].nama);
            System.out.println("Kelas   : "+ arrayOfMahasiswa25[i].kelas);
            System.out.println("IPK     : "+ arrayOfMahasiswa25[i].ipk);
            System.out.println("-----------------------------------");
        }
    }
}
        