public class ReverseString {
    public static String ReverseString(String s) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        return str.toString();

    }

    public static void main(String[] args) {
        String s = "shakti";

        System.out.println(ReverseString(s));

    }
}
