import java.util.*;

public class RomanConverter {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.getOrDefault(s.charAt(i), 0);
            if (curr == 0) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + s.charAt(i));
            }
            if (curr >= prev) {
                result += curr;
            } else {
                result -= curr;
            }
            prev = curr;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman numeral to convert to an integer:");
        String romanNumeral = scanner.nextLine();
        scanner.close();

        try {
            int result = romanToInt(romanNumeral);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
