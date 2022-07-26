package test.integer_to_english;

import integer_to_english.Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSolution {
    @Parameterized.Parameters(name = "Test {index}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "One"},
                {3, "Three"},
                {14, "Fourteen"},
                {17, "Seventeen"},
                {20, "Twenty"},
                {22, "Twenty Two"},
                {30, "Thirty"},
                {34, "Thirty Four"},
                {49, "Forty Nine"},
                {99, "Ninety Nine"},
                {100, "One Hundred"},
                {110, "One Hundred Ten"},
                {523, "Five Hundred Twenty Three"},
                {999, "Nine Hundred Ninety Nine"},
                {1_000, "One Thousand"},
                {1_010, "One Thousand Ten"},
                {823_418, "Eight Hundred Twenty Three Thousand Four Hundred Eighteen"},
                {800_418, "Eight Hundred Thousand Four Hundred Eighteen"},
        });
    }

    private final Solution solver = new Solution();

    private final int input;

    private final String expected;

    public TestSolution(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSolve() {
        Assert.assertEquals(expected, solver.solve(input));
    }
}
