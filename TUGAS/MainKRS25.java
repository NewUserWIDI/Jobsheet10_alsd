package TUGAS;

import java.util.Scanner;
public class MainKRS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS25 antrian = new AntrianKRS25();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa sekaligus)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Sudah Proses KRS");
            System.out.println("8. Cetak Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("NIM    : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi  : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas  : ");
                    String kelas = sc.nextLine();
                    MahasiswaKRS25 m = new MahasiswaKRS25(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.lihatSemua();
                    break;
                case 4:
                    antrian.lihatDepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    System.out.println("Sudah proses KRS: " + antrian.jumlahDiproses());
                    break;
                case 8:
                    System.out.println("Belum proses KRS: " + antrian.belumDiproses());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}