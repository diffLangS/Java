/*
Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.
        Examples:
        Input: 21445 Output: 54421
        Input: 145263 Output: 654321
        Input: 123456789 Output: 987654321
*/

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int number = sortDesc(21445);
        System.out.println(number);
    }

    public static int sortDesc(final int num) {
        String text = "";
        String[] numToString = String.valueOf(num).split("");
        Arrays.sort(numToString, Collections.reverseOrder());
        for (String n : numToString) {
            text+=n;
        }
        return Integer.parseInt(text);

    }
}


//Solution from site

/*
import java.util.Arrays;
        import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
*/
