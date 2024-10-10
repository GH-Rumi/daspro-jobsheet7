import java.util.Scanner;
public class tugas211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
        
            int jenis, durasi = 0, total = 0;

            
            do {
                System.out.print("Masukkan kendaraan yang dinaiki dengan angka (1 = mobil, 2 = motor, 0 = keluar): ");
                jenis = sc.nextInt();
                if (jenis == 1 || jenis == 2) {
                    System.out.print("Masukkan durasi dalam jam: ");
                    durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                    total += durasi * 3000;
                } 
                else if (jenis == 2) {
                    total += durasi * 2000;
                }
                }
                } 
            } while (jenis != 0);
            System.out.println("Total tarif parkir yang harus dibayar: " + total);
        }
    }
}
