import java.util.Scanner;

public class DoWhileCuti10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti tidak mencukupi, masukkan jumlah cuti yang tersedia!!");
                    continue;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Semangat Bekerja");
                break;
            } else {
                break;
            }
        } while (jatahCuti > 0);
    }
}
