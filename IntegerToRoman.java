import java.util.*;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // int[] code={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        // String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        // StringBuilder sb = new StringBuilder();

        // for(int i=0i<code.length;i++){
        // while(num >= code(i)){
        // sb.append(soman(i));
        // num -= code[i];
        // }

        // return sb.toString();

        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "I");
        hmap.put(4, "IV");
        hmap.put(5, "V");
        hmap.put(9, "IX");
        hmap.put(10, "X");
        hmap.put(40, "XL");
        hmap.put(50, "L");
        hmap.put(90, "XC");
        hmap.put(100, "C");
        hmap.put(400, "CD");
        hmap.put(500, "D");
        hmap.put(900, "CM");
        hmap.put(1000, "M");

        StringBuilder sb = new StringBuilder();
        for (int i : new Integer[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }) {
            while (num >= i) {
                sb.append(hmap.get(i));
                num -= i;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println(intToRoman(num));
    }
}
