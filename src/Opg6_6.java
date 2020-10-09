import java.util.Scanner;

public class Opg6_6 {
    public static void main(String[] args) {
        displayPattern(10);
    }

    public static void displayPattern(int n) {
        // determine the format width of each digit in pyramid
        int width = getWidth(n);

        // generate padding of this width
        String padding = "";
        for (int i = 0; i < width; i++) {
            padding += " ";
        }

        for (int i = 1; i <= n; i++) {
            // print padding
            for (int j = 0; j < n - i; j++) {
                System.out.print(padding);
            }
            // print left half-pyramid
            for (int k = i; k >= 1; k--) {
                System.out.print(String.format("%-"+width+"d", k));
            }
            System.out.println();
        }
    }

    private static int getWidth(int n) {
        StringBuilder s = new StringBuilder(n + "");
        return s.length() + 1;
    }
}

