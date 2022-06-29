import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14, a, alan, r;
        System.out.print("Yarı çapı giriniz: ");
        r = input.nextDouble();
        System.out.println("merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();
        alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);


    }
}