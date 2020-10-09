import java.util.Scanner;

public class Opg6_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 1;
        int num2 = 100;
        int numberOfLines = input.nextInt();
        PrintNumbers(num1, num2, numberOfLines);

    }
    public static void PrintNumbers(int num1, int num2, int numbersOfLines){
        for(int i = 1; i <= num2; ++i){
            if( i % numbersOfLines != 0 ) {
                System.out.print(i + " ");
            }else{
                System.out.println(i);
            }
        }
    }
}
