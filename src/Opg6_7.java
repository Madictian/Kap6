import java.util.Scanner;

public class Opg6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investmentAmount = 1000;
        double monthlyInterest = (0.09 / 12);
        int years = input.nextInt();

        for (int year = 1; year <= years; year++) {
            System.out.printf("%-10d", year);
            System.out.printf("%11.2f\n",
                    investmentValue(investmentAmount, monthlyInterest, year));

        }}
    public static double investmentValue(double investmentAmount, double monthlyInterest, int years){
        double futureAmount = 0;
        for(int i = 1; i <= years; ++i){
            for (int m = 1; m <= 12 ; ++m){
                futureAmount = investmentAmount + (investmentAmount * monthlyInterest);
                investmentAmount = futureAmount;
            }


        }

        return futureAmount;
    }
}
