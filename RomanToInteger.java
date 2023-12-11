import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String str) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('I', 1);
        hmap.put('V', 5);
        hmap.put('X', 10);
        hmap.put('L', 50);
        hmap.put('C', 100);
        hmap.put('D', 500);
        hmap.put('M', 1000);

        int result = hmap.get(str.charAt(str.length() - 1));

        for (int i = str.length() - 2; i >= 0; i--) {
            if (hmap.get(str.charAt(i)) < hmap.get(str.charAt(i + 1))) {
                result -= hmap.get(str.charAt(i));
            } else {
                result += hmap.get(str.charAt(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String s = "XXXVI";

        System.out.println(romanToInt(s));
    }
}
