import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alan, cevre, pi = 3.14, r;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        alan = pi * r * r;
        cevre = 2 * (pi * r);
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);


    }
}