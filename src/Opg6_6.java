import java.util.Scanner;

public class Opg6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        displayPattern(n);
    }
    public static void displayPattern(int n){
        String printAscend = "";
        String printDescend = "";
        for (int i = 1; i <= n ;++i){

            String line = Integer.toString(i);
            printAscend += line + " ";
            System.out.println(printAscend);
            line ="";
        }
        for (int i = n; i >= 1 ;--i){
            for(int m = i; m >= 0; --m){
                if (m != 0){
                    System.out.print(m + " ");
                }else{
                    System.out.println();
                }
}
}
}
}

