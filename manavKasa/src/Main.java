import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutkilo=2.14,elmakilo=3.67,domateskilo=1.11,muzkilo=0.95,patlicankilo=5.00,tutar;
        double armut,elma,domates,muz,patlican;
        Scanner input= new Scanner (System.in);
        System.out.print("Kaç kilo armutunuz var: ");
        armut=input.nextDouble();
        System.out.print("Kaç kilo elmanız var: ");
        elma=input.nextDouble();
        System.out.print("Kaç kilo domatesiniz var: ");
        domates=input.nextDouble();
        System.out.print("Kaç kilo muzunuz var: ");
        muz=input.nextDouble();
        System.out.print("Kaç kilo patlican var: ");
        patlican=input.nextDouble();
        tutar = armut * armutkilo + elma * elmakilo + domates * domateskilo + muz * muzkilo + patlican * patlicankilo;
        System.out.print("Toplam tutarınız: "+tutar);




    }
}
