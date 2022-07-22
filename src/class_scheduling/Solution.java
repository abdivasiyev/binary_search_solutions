package class_scheduling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Solution {
    public int solve(int[][] times) {
        if (times.length <= 0) return 0;

        Arrays.sort(times, Comparator.comparingInt(time -> time[1]));
        int[] currentSchedule, lastSchedule = times[0];
        int result = 1;

        for (int i = 1; i < times.length; i++) {
            currentSchedule = times[i];

            if (currentSchedule[0] > lastSchedule[1]) {
                lastSchedule = currentSchedule;
                result++;
            }
        }

        return result;
    }
}
