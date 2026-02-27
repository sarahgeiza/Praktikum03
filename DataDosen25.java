public class DataDosen25 {
    public void dataSemuaDosen(Dosen25[] arrayOfDosen) {
        System.out.println("\n==== DATA SEMUA DOSEN ====");
        for (Dosen25 dsn : arrayOfDosen) {
            dsn.tampilkanData();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen25[] arrayDosen25) {
    int pria = 0;
    int wanita = 0;

    for (Dosen25 dsn : arrayDosen25) {
        if (dsn.jenisKelamin) {
            pria++;
        } else {
            wanita++;
        }
    }

    System.out.println("\n==== JUMLAH DOSEN PER JENIS KELAMIN ====");
    System.out.println("Jumlah Pria     : " + pria);
    System.out.println("Jumlah Wanita   : " + wanita);
}

public void  rerataUsiaDosenPerJenisKelamin(Dosen25[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen25 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalPria += dsn.usia;
                jumlahPria++;
            } else {
                totalWanita += dsn.usia;
                jumlahWanita++;
            }
        }

        System.out.println("\n===== RATA-RATA USIA DOSEN =====");

        if (jumlahPria > 0)
            System.out.println("Rata-rata usia Pria   : " + (totalPria / jumlahPria));

        if (jumlahWanita > 0)
            System.out.println("Rata-rata usia Wanita : " + (totalWanita / jumlahWanita));
    }

    public void infoDosenPalingTua(Dosen25[] arrayOfDosen) {
        Dosen25 tertua = arrayOfDosen[0];

        for (Dosen25 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }

        System.out.println("\n===== DOSEN PALING TUA =====");
        tertua.tampilkanData();
    }

    public void infoDosenPalingMuda(Dosen25[] arrayOfDosen) {
        Dosen25 termuda = arrayOfDosen[0];

        for (Dosen25 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }

        System.out.println("\n===== DOSEN PALING MUDA =====");
        termuda.tampilkanData();
    }
}


