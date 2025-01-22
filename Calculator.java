import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        char operator;

        System.out.println("Basit Hesap Makinesi");
        System.out.println("--------------------");

        System.out.print("İlk sayıyı girin: ");
        sayi1 = scanner.nextDouble();

        System.out.print("İşlemi girin (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }
} 