import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + endeks);

    }
}

