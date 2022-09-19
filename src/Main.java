import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double aKenari, bKenari, cKenari;
        double cHipotenus;
        double uCevre;
        double uAlan;
        double uU;

        Scanner kenar = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz :");
        aKenari = kenar.nextDouble();
        System.out.println("2.Kenari Giriniz :");
        bKenari = kenar.nextDouble();

        cKenari = (aKenari*aKenari) + (bKenari*bKenari);
        cHipotenus = Math.sqrt(cKenari);
        System.out.println("Üçgenin Hipotenüsü : " + cHipotenus);

        uCevre = aKenari+bKenari+cHipotenus;
        System.out.println("Üçgenin Çevresi : " + uCevre);

        uU = (aKenari + bKenari + cHipotenus) /2;
        uAlan =Math.sqrt(uU * (uU-aKenari)*(uU-bKenari)*(uU-cHipotenus)) * 2;
        System.out.println("Üçgenin Alanı : " + uAlan);






    }
}