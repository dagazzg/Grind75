package java;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int upperBound = nums.length - 1;
        int lowerBound = 0;
        int middleIndex = lowerBound + ((upperBound - lowerBound) / 2);
        while (nums[middleIndex] != target) {
            if (lowerBound >= upperBound) return -1;
            if (nums[middleIndex] < target) lowerBound = middleIndex + 1;
            else upperBound = middleIndex - 1;
            middleIndex = lowerBound + ((upperBound - lowerBound) / 2);
        }
        return middleIndex;

    }
}
