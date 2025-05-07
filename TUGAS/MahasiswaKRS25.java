package TUGAS;

public class MahasiswaKRS25 {
        String nim, nama, prodi, kelas;
    
        public MahasiswaKRS25(String nim, String nama, String prodi, String kelas) {
            this.nim = nim;
            this.nama = nama;
            this.prodi = prodi;
            this.kelas = kelas;
        }
    
        public void tampilkanData() {
            System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
        }
    }  
