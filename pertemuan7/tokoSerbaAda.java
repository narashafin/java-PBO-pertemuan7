package pertemuan7;

import java.util.Scanner;

public class tokoSerbaAda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodeBarang[] = {"BT001", "BT002", "BT003", "BT004"};
        String namaBarang[] = {"Buku", "Pensil", "Pulpen", "Baju"};
        int hargaBarang[] = {5000, 3000, 4000, 50000};

        System.out.println("\n********************************");
        System.out.println("Selamat Datang di Toko Serba Ada");
        System.out.println("********************************");
        System.out.print("Masukkan jumlah item barang : ");
        int jumlahItem = scanner.nextInt();

        String[] kode = new String[jumlahItem];
        int[] jumlah = new int[jumlahItem];
        String[] nama = new String[jumlahItem];
        int[] harga = new int[jumlahItem];
        int[] total = new int[jumlahItem];

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan kode barang : ");
            kode[i] = scanner.next();
            System.out.print("Masukkan jumlah beli : ");
            jumlah[i] = scanner.nextInt();


            boolean find = false;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode[i].equalsIgnoreCase(kodeBarang[j])) {
                    nama[i] = namaBarang[j];
                    harga[i] = hargaBarang[j];
                    total[i] = harga[i] * jumlah[i];
                    find = true;
                    break; 
                }
            }

            if (!find) {
                System.out.println("Kode barang " + kode[i] + " tidak ditemukan!");
                nama[i] = "-";
                harga[i] = 0;
                total[i] = 0;
            }
        }

        System.out.println("\n\n**************");
        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");
        System.out.println("No\tKode Barang Nama Barang\tHarga Jumlah Beli Jumlah Bayar");
        System.out.println("==============================================================");

        int totalBayar = 0;
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + "\t\t" + kode[i] + "\t\t" + nama[i] + "\t" + harga[i] + "\t\t" + jumlah[i] + "\t\t\t" + total[i]);
            totalBayar += total[i];
        }

        System.out.println("==============================================================");
        System.out.println("Total Bayar : \t\t\t\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("==============================================================");
    }
}

