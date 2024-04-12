package org.example;

import java.util.Arrays;

public class LexicographicRank {

    // Define a function to calculate the factorial of a
    // given number using recursion
    static int fact(int n)
    {
        // Base case: if n is 0 or 1, return 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: return n times the factorial of
        // n-1
        return n * fact(n - 1);
    }

    // Define a function to calculate the rank of a given
    // string in lexicographic permutation order
    static int findRank(String str)
    {
        // Calculate the length of the input string
        int n = str.length();
        // Initialize the rank as 1
        int rank = 1;

        // Loop through each character of the string
        for (int i = 0; i < n; i++) {
            // Initialize a variable to count the number of
            // characters less than str.charAt(i)
            int count = 0;

            // Loop through the characters after
            // str.charAt(i)
            for (int j = i + 1; j < n; j++) {
                // If str.charAt(i) is greater than
                // str.charAt(j), increment the count
                // variable
                if (str.charAt(i) > str.charAt(j)) {
                    count++;
                }
            }

            // Update the rank based on the count of
            // characters less than str.charAt(i) multiplied
            // by the factorial of the number of remaining
            // characters
            rank += count * fact(n - i - 1);
        }

        // Return the final rank of the input string
        return rank;
    }

    // Define the main function
    public static void main(String[] args)
    {
        // Define a test string
        String str = "ba";
        // Call the findRank function on the test string and
        // print the result
        System.out.println(findRank(str));
    }
}
