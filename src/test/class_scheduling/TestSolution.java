package test.class_scheduling;

import class_scheduling.Solution;
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
                {new int[][]{{5, 8}, {2, 5}, {8, 10}, {6, 7}}, 3},
                {new int[][]{{1, 3}, {2, 5}, {4, 5}, {3, 5}}, 2},
        });
    }

    private final Solution solver = new Solution();

    private final int[][] input;

    private final int expected;

    public TestSolution(int[][] input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testSolve() {
        Assert.assertEquals(expected, solver.solve(input));
    }
}
