import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran,kdvtutari,kdvlitutar;
        kdvOran= 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün KDV'siz tutarını giriniz: ");
        tutar = input.nextDouble();
        kdvtutari = tutar*kdvOran;
        kdvlitutar = tutar+kdvtutari;
        System.out.println("Ürünün Kdv tutarı: "+kdvtutari);
        System.out.println("Ürünün Kdv'li fiyatı: "+kdvlitutar);




    }
}