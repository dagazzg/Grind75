package java;

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int floor = 1;
        int ceiling = n;
        int firstBad = -1;
        while (floor <= ceiling) {
            int middle = floor + (ceiling - floor) / 2;
            boolean isBad = isBadVersion(middle);
            if (isBad) {
                firstBad = middle;
                ceiling = middle - 1;
            } else {
                floor = middle + 1;
            }
        }
        return firstBad;
    }

}
