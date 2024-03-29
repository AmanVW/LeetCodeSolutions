import java.util.Map;
import java.util.HashMap;
public class LC_13_Solution {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
        int previous = 0;

        for (int i = s.length() - 1; i >=0; i--) {
            int current = map.get(s.charAt(i));
            if (current < previous) {
                number -= current;
                continue;
            }

            number += current;
            previous = current;
        }
        return number;
    }
}
