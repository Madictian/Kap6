public class Opg6_38 {
    public static void main(String[] args) {
        char ch1    = 'a';
        char ch2    = 'z';
        char num1   ='0';
        char num2   ='9';
        System.out.println(getRandomChar(ch1,ch2));
        System.out.println(getRandomChar(num1,num2));
        int total_numbers = 200;
        int number_per_line = 10;
        printLinesnumbers(total_numbers,number_per_line, num1, num2);
        printLinesletters(total_numbers,number_per_line, ch1, ch2);

    }
    public static char getRandomChar(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomnum(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static void printLinesnumbers(int total_numbers,int number_per_line, char num1, char num2) {
        for (int i = 1; i <= total_numbers; ++i) {
            if (i % number_per_line != 0) {
                System.out.print(getRandomChar(num1, num2) + " ");
            } else {
                System.out.println(getRandomChar(num1, num2));
            }
        }}
    public static void printLinesletters(int total_numbers,int number_per_line, char ch1, char ch2) {
        for (int i = 1; i <= total_numbers; ++i) {
            if (i % number_per_line != 0) {
                System.out.print(getRandomChar(ch1,ch2) + " ");
            } else {
                System.out.println(getRandomChar(ch1,ch2));
            }


        }
    }}