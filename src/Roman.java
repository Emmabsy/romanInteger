import java.util.*;

public class Roman {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if (i < s.length() - 1 && value < map.get(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String[] testCases = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        int[] expectedResults = {3, 4, 9, 58, 1994};

        for (int i = 0; i < testCases.length; i++) {
            int result = romanToInt(testCases[i]);
            if (result == expectedResults[i]) {
                System.out.println("Test case " + (i + 1) + " passed.");
            } else {
                System.out.println("Test case " + (i + 1) + " failed.");
            }
        }
    }
}
