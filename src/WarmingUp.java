import java.util.Arrays;

/**
 * Created by Dim on 05.03.2016.
 */
public class WarmingUp {

    /*    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /*    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.*/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /*    Given two int values, return their sum. Unless the two values are the same, then return double their sum.*/
    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    /*    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.*/
    public int diff21(int n) {
        if (n > 21) {
            return 2 * Math.abs(21 - n);
        } else {
            return Math.abs(21 - n);
        }
    }

    /*    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.*/
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /*    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.*/
    public boolean makes10(int a, int b) {
        int sum = a + b;
        return a == 10 || b == 10 || sum == 10;
    }

    /*   Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.*/
    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    /*    Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.*/
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }

    /*    Given a string, return a new string where "not " has been added to the front.
        However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.*/
    public String notString(String str) {
        String subString;

        if (str.length() < 3) {
            str = "not " + str;
            return str;
        } else {
            subString = str.substring(0, 3);
        }

        if (subString.equals("not")) {
            return str;
        } else {
            str = "not " + str;
            return str;
        }
    }

    /*    Given a string, return a new string where the first and last chars have been exchanged.*/
    public String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        }

        char[] chars = str.toCharArray();
        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;
        return String.copyValueOf(chars);
    }

    /*    Given a string, we'll say that the front is the first 3 chars of the string.
        If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front. */
    public String front3(String str) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        return front + front + front;
    }

    /*    Given a string, take the last char and return a new string with the last char added
        at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.*/
    public String backAround(String str) {
        String lastChar = str.substring(str.length() - 1);
        return lastChar + str + lastChar;
    }

    /*Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod*/
    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    /*    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
        so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.*/
    public String front22(String str) {
        String front;

        if (str.length() < 2) {
            front = str;
        } else {
            front = str.substring(0, 2);
        }
        return front + str + front;
    }

    /*    Given a string, return true if the string starts with "hi" and false otherwise.*/
    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.*/
    public boolean icyHot(int temp1, int temp2) {
        return Math.min(temp1, temp2) < 0 && Math.max(temp1, temp2) > 100;
    }

    /* Given 2 int values, return true if either of them is in the range 10..20 inclusive.*/
    public boolean in1020(int a, int b) {
        return inRange(a, 10, 20) || inRange(b, 10, 20);
    }

    /*  We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
    return true if 1 or more of them are teen. */
    public boolean hasTeen(int a, int b, int c) {
        return inRange(a, 13, 19) ||
                inRange(b, 13, 19) ||
                inRange(c, 13, 19);
    }

    /*  We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both. */
    public boolean loneTeen(int a, int b) {
        return inRange(a, 13, 19) ^ inRange(b, 13, 19);
    }

    /*    Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
        Otherwise, return the string unchanged.*/
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        } else {
            return str;
        }
    }

    /*    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.*/
    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

    /*    Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o'
        and include the second only if it is 'z', so "ozymandias" yields "oz".*/
    public String startOz(String str) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'o') {
            result = result + str.substring(0, 1);
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result = result + str.substring(1, 2);
        }
        return result;
    }

    /*    Given three int values, a b c, return the largest.*/
    public int intMax(int a, int b, int c) {
        int[] array = new int[]{a, b, c};
        Arrays.sort(array);
        return array[2];
    }

    /*    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.*/
    public int close10(int a, int b) {
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        } else if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else {
            return b;
        }
    }

    /*    Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.*/
    public boolean in3050(int a, int b) {
        return (inRange(a, 30, 40) && inRange(b, 30, 40)) ||
                (inRange(a, 40, 50) && inRange(b, 40, 50));
    }

    /*    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.*/
    public int max1020(int a, int b) {
        if (!inRange(a, 10, 20) && !inRange(b, 10, 20)) {
            return 0;
        }
        if (inRange(Math.max(a, b), 10, 20)) {
            return Math.max(a, b);
        } else {
            return Math.min(a, b);
        }
    }

    /*    Return true if the given string contains between 1 and 3 'e' chars.*/
    public boolean stringE(String str) {
        char[] chars = str.toCharArray();
        int eCounter = 0;
        for (char element : chars) {
            if (element == 'e') {
                eCounter++;
            }
        }
        return inRange(eCounter, 1, 3);
    }

    /*    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
    Note that the % "mod" operator computes remainders, so 17 % 10 is 7.*/
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    /*    Given a string, return a new string where the last 3 chars are now in upper case.
        If the string has less than 3 chars, uppercase whatever is there.
        Note that str.toUpperCase() returns the uppercase version of a string.*/
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }

        String ending = str.substring(str.length() - 3, str.length()).toUpperCase();
        return str.substring(0, str.length() - 3).concat(ending);
    }

    /*    Given a non-empty string and an int N, return the string made starting with char 0,
        and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
        N is 1 or more.*/
    public String everyNth(String str, int n) {
        String result = "";
        char nChar;

        for (int i = 0; i < str.length(); i += n) {
            nChar = str.charAt(i);
            result = result + String.valueOf(nChar);
        }
        return result;
    }

    //SUPPORT FUNCTION, returns true if num is in min..max range inclusive
    private static boolean inRange(int num, int min, int max) {
        if (min >= max) {
            System.out.println("error: min >= max");
            return false;
        }
        return num >= min && num <= max;
    }
}
