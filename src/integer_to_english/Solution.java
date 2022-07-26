package integer_to_english;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Integer, String> numsMap;

    public Solution() {
        numsMap = makeNumsMap();
    }

    public String solve(int num) {
        if (num >= 0 && num < 20) {
            return this.numsMap.get(num);
        }

        if (num >= 20 && num < 100) {
            if (num % 10 != 0) {
                return this.numsMap.get(num / 10 * 10) + " " + solve(num % 10);
            } else {
                return this.numsMap.get(num);
            }
        }

        if (num >= 100 && num < 1_000) {
            if (num % 100 == 0) {
                return solve(num/100) + " Hundred";
            }
            return solve(num/100) + " Hundred " + solve(num % 100);
        }

        if (num >= 1_000 && num < 1_000_000) {
            if (num % 1_000 == 0) {
                return solve(num/1_000) + " Thousand";
            }
            return solve(num/1_000) + " Thousand " + solve(num % 1_000);
        }

        if (num >= 1_000_000 && num < 1_000_000_000) {
            if (num % 1_000_000 == 0) {
                return solve(num/1_000_000) + " Million";
            }
            return solve(num/1_000_000) + " Million " + solve(num % 1_000_000);
        }

        if (num >= 1_000_000_000) {
            if (num % 1_000_000_000 == 0) {
                return solve(num/1_000_000_000) + " Billion";
            }
            return solve(num/1_000_000_000) + " Billion " + solve(num % 1_000_000_000);
        }

        return "";
    }

    private Map<Integer, String> makeNumsMap() {
        Map<Integer, String> result = new HashMap<>();

        result.put(0, "Zero");
        result.put(1, "One");
        result.put(2, "Two");
        result.put(3, "Three");
        result.put(4, "Four");
        result.put(5, "Five");
        result.put(6, "Six");
        result.put(7, "Seven");
        result.put(8, "Eight");
        result.put(9, "Nine");
        result.put(10, "Ten");
        result.put(11, "Eleven");
        result.put(12, "Twelve");
        result.put(13, "Thirteen");
        result.put(14, "Fourteen");
        result.put(15, "Fifteen");
        result.put(16, "Sixteen");
        result.put(17, "Seventeen");
        result.put(18, "Eighteen");
        result.put(19, "Nineteen");
        result.put(20, "Twenty");
        result.put(30, "Thirty");
        result.put(40, "Forty");
        result.put(50, "Fifty");
        result.put(60, "Sixty");
        result.put(70, "Seventy");
        result.put(80, "Eighty");
        result.put(90, "Ninety");

        return result;
    }
}
