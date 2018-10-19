import java.util.Scanner;

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
