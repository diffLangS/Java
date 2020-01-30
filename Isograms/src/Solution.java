/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

        isIsogram "Dermatoglyphics" == true
        isIsogram "aba" == false
        isIsogram "moOse" == false -- ignore letter case
*/

public class Solution {
    public static void main(String[] args) {

        boolean isCheck = isIsogram("Dermatoglyphics");
        System.out.println(isCheck);
    }
    public static boolean  isIsogram(String str) {
        boolean isCheck = true;
        String[] arrStr = str.split("");
        for (int i = 0; i < arrStr.length ; i++) {
            for (int j = 0; j < arrStr.length; j++) {
                if (i == j) continue;
                if (arrStr[i].equalsIgnoreCase(arrStr[j] )) return false;
            }
        }
        return isCheck;
    }
}


//Solution from site

/*
public class isogram {
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
*/
