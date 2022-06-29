import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        matematik = input.nextInt();

        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuz:");
        turkce = input.nextInt();

        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();

        System.out.println("Tarih notunuz:");
        tarih = input.nextInt();

        System.out.println("Müzik notunuz:");
        muzik = input.nextInt();

        int toplam = (matematik+fizik+turkce+kimya+tarih+muzik);
        double sonuc = toplam/6;

        System.out.println("Genel ortalamanız:"+sonuc);
        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sıfta Kaldı");


    }
}