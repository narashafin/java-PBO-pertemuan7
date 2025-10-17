package pertemuan7;

import java.util.Scanner;

public class tokoSerbaAda{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String kodeBarang [] = {"BT001", "BT002", "BT003", "BT004"};
        String namaBarang [] = {"Buku", "Pensil", "Pulpen", "Baju"};
        int hargaBarang[] = {5000, 3000, 4000, 50000 };
        int i;

        System.out.println("Selamat Datang di Toko Serba Ada");
        System.out.println("********************************");
        System.out.print("Masukkan jumlah item barang : ");
        int jumlahItem = scanner.nextInt();

        String[] kode = new String[jumlahItem];
        int[] jumlah= new int[jumlahItem];
        String[] nama = new String[jumlahItem];
        int[] harga = new int[jumlahItem];
        int[] total = new int[jumlahItem];

        for(i=0; i < jumlahItem; i++){
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan kode barang : ");
            kode[i] = scanner.next();
            System.out.print("Masukkan jumlah beli : ");
            jumlah[i] = scanner.nextInt();
        }

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[i].equalsIgnoreCase(kodeBarang[j])) {
                        nama[i] = namaBarang[j];
                        harga[i] = hargaBarang[j];
                        total[i] = harga[i] * jumlah[i];
                }
            }

        System.out.println("\n TOKO SERBA ADA");
        System.out.println("**************");
        System.out.println("No\t kode Barang\t Nama Barang\t Harga\t Jumlah Beli\t Jumlah Bayar\t");
        System.out.println("===============================================================");


        for(i = 0; i< jumlahItem; i++){
            System.out.println((i+1) + "\t" + kode[i] + "\t\t" + nama[i] + "\t\t" + harga[i] + "\t" + jumlah[i] + "\t\t" + total[i]);
        }

        int totalBayar = 0;
        System.out.println("===============================================================");
        totalBayar += total[i];
        System.out.println("Total Bayar\t\t\t\t\t" + totalBayar);


    }


}
