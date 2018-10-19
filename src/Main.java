import java.util.Scanner;

/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Mencari massa jenis dari variabel massa dan sisi kubus
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Kubus kub = new Kubus();

        System.out.println("===Massa Janes Kubus===");
        System.out.print("Sisi \t: ");
        kub.setSisi(scn1.nextInt());
        System.out.print("Massa \t: ");
        kub.setMassa(scn1.nextInt());

        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("Volume \t: "+kub.hitungVolume(kub.getSisi()));
        System.out.println("Massa Jenis : "+kub.hitungMassaJenis(kub.getMassa(), kub.hitungVolume(kub.getSisi())));

    }
}
