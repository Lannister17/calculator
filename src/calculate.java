import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        int a,b,select;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz (a): ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz (b) : ");
        b = input.nextInt();
        System.out.print("Yapacağınız işlem : \n 1-Çarpma \n 2-Bölme \n 3-Toplama \n 4-Cıkarma \n");
        select = input.nextInt();
        switch (select) {
            case 1:
                result = a * b;
                System.out.println("Sonuc (a*b) : " + result);
                break;
            case 2 :
                result = a / b;
                System.out.println("Sonuc (a/b) : " + result);
                break;
            case 3 :
                result = a + b;
                System.out.println("Sonuc (a+b) : " + result);
                break;
            case 4 :
                result = a - b;
                System.out.println("Sonuc (a-b): " + result);
            default:
                System.out.println(" Tanımsız işlem girdiniz.");
        }
    }
}
