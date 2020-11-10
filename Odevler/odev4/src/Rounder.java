package Odevler.odev4.src;
import java.util.Scanner;

public class Rounder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalik bir sayi giriniz");
        double input = scanner.nextDouble();
        System.out.println("Lutfen yuvarlama methodu seciniz: 1-Asagi 2-Yukari");
        int method = scanner.nextInt();
        switch (method) {
            case 1:
                input = Math.floor(input);
                System.out.println("Asagi yuvarlanmis sayiniz: " + (int)input);
                break;
            case 2:
                input = Math.ceil(input);
                System.out.println("Yukari yuvarlanmış sayınız: " + (int) input);
                break;
            default:
                System.out.println("Lütfen geçerli bir ifade giriniz. 1-Aşağı, 2-Yukarı");
                break;

        }

    }
}
