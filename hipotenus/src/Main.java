import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        b = input.nextInt();
        c= Math.sqrt((a*a)+(b*b));

        System.out.printf("Hipotenüs değeri: "+ c);

    }
}
