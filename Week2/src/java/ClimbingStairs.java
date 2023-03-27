package java;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int previous = 1;
        int previousTwo = 2;
        for(int i = 3; i <= n; i++) {
            int nextStep = previous + previousTwo;
            previous = previousTwo;
            previousTwo = nextStep;
        }
        return previousTwo;
    }
}
