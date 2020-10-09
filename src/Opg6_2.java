import java.util.Scanner;

public class Opg6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testMetode();
    }
    public static long sunDigits(long n) {

        long resultat = 0;
        long digit1 = n % 10;
        long digit2 = (n / 10) % 10;
        long digit3 = (n / 100) % 10;
        return resultat = digit1 + digit2 + digit3;
    }
    static void testMetode(){
        System.out.printf("234 giver 9: %d", sunDigits(234));
    }
}
