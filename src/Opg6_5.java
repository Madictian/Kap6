import java.sql.SQLOutput;
import java.util.Scanner;

public class Opg6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number 1: ");
        double num1 = input.nextDouble();
        System.out.println("number 2: ");
        double num2 = input.nextDouble();
        System.out.println("number 3: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
        displaySortedNumbers(30.0, 20.0, 10.0);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if (num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println( num1 + " " + num2 + " " + num3);

            }else{
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }else if(num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println(num2 + " " + num1 + " " + num3); }else{
                System.out.println(num2 + " " + num3 + " " + num1);
            }}else{
                if (num1 > num2){
                    System.out.println(num3 + " " + num1 + " " + num2);
                }else{
                    System.out.println(num3 + " " + num2 + " " + num1);
                }
            }

        }


    }

