import java.util.Scanner;
public class tugas111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalHarga = 0, hargaTiket = 50000;
        int i = 1, jmlTiket = 0;

        System.out.print("Masukkan tiket yang terjual (masukkan 0 untuk menghentikan) 1: ");
        jmlTiket = sc.nextInt();

        if (jmlTiket > 0 && jmlTiket <= 4) {
            totalHarga = jmlTiket * hargaTiket;
            System.out.println("Total harga anda sejumlah: RP." + totalHarga);
        } else if (jmlTiket > 4 && jmlTiket <= 10) {
            totalHarga = (jmlTiket * hargaTiket) * 0.9;
            System.out.println("Total harga anda sejumlah: RP." + totalHarga);
        } else {
            totalHarga = (jmlTiket * hargaTiket) * 0.85;
            System.out.println("Total harga anda sejumlah: RP." + totalHarga);
        }

        
        while (jmlTiket != 0) {
            System.out.print("Masukkan tiket yang terjual (masukkan 0 untuk menghentikan) " + (i + 1) + ": ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid, masukkan lagi");
                continue;
            }
                if (jmlTiket > 0 && jmlTiket <= 4) {
                    totalHarga = jmlTiket * hargaTiket;
                    System.out.println("Total harga anda sejumlah: RP." + totalHarga);
                } else if (jmlTiket > 4 && jmlTiket <= 10) {
                    totalHarga = (jmlTiket * hargaTiket) * 0.9;
                    System.out.println("Total harga anda sejumlah: RP." + totalHarga);
                } else {
                    totalHarga = (jmlTiket * hargaTiket) * 0.85;
                    System.out.println("Total harga anda sejumlah: RP." + totalHarga);
                }
                i++;
        }
    }
}
