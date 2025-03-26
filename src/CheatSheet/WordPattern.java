package CheatSheet;

public class WordPattern {
    public static void printPattern(String s) {
        int n = s.length();
        int mid = n / 2; // Calculate the middle index of the word

        for (int i = 0; i < n; i++) {
            String result = ""; // Initialize the result string for each line
            int left = mid, right = mid; // Start from the middle character

            // Expand outward from the middle
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) { // Add characters to the right
                    result += s.charAt(right);
                    if (right < n - 1) right++;
                } else { // Add characters to the left
                    left--;
                    if (left >= 0) result = s.charAt(left) + result;
                }
            }

            // Add the `$` symbol
            result += "$";

            // Print the result
            System.out.print(result + " ");
        }
    }

    public static void main(String[] args) {
        // Test cases
        printPattern("PROGRAM");
        System.out.println();
      //  printPattern("RAT");
    }
}


