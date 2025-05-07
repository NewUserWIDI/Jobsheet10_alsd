package TUGAS;

public class AntrianKRS25 {
    MahasiswaKRS25[] data;
    int front, rear, size, max = 10;
    int totalDilayani = 0;

    public AntrianKRS25() {
        data = new MahasiswaKRS25[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambahAntrian(MahasiswaKRS25 m) {
        if (isFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " berhasil masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal dua mahasiswa dibutuhkan untuk proses.");
            return;
        }
        System.out.println("Memproses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            MahasiswaKRS25 m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }

    public void lihatSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatDepan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 mahasiswa dalam antrian.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir:");
            data[rear].tampilkanData();
        }
    }

    public int jumlahAntrian() {
        return size;
    }

    public int jumlahDiproses() {
        return totalDilayani;
    }

    public int belumDiproses() {
        return 30 - totalDilayani;
    }
}