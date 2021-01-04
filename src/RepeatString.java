import java.util.Scanner;

public class RepeatString {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println(result);

    }

    /**
     * Function to get repeated string
     */
    static long repeatedString(String s, long n) {
        //repeat count
        long count = 0;

        //loop to find number of occurrences of a given string s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        //find how many times the sub string s is repeated
        long factor = (n / s.length());
        //if there are any remainder string
        long rem = (n % s.length());
        //multiple the count to factor to get count of appearance in the multiple string
        count = factor * count;
        //condition to return count if rem is 0
        if (rem != 0) {
            //loop through the remainder string to find occurrence
            for (int i = 0; i < rem; i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        return count;
    }
}
