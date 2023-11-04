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
                } else if (jumlahHari < jatahCuti) {
                    System.out.print("Masukkan sisa jatah cuti yang tersedia : ");
                    jumlahHari = sc.nextInt();
                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -= jumlahHari;
                        System.out.println("Jatah cuti Anda habis");
                    }
                    break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Semangat Bekerja");
                break;
            } else {
                System.out.println("Sisa jatah cuti tidak mencukupi");
                break;
            }
        } while (jatahCuti > 0);
    }
}
