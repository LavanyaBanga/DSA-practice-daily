import java.util.*;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int n = nums.length;
        int i = 0;
        int maxFreq = 0;
        int totalCount = 0;

        while (i < n) {
            int target = nums[i];
            int first = findFirst(nums, target);
            int last = findLast(nums, target);
            int freq = last - first + 1;

            if (freq > maxFreq) {
                maxFreq = freq;
                totalCount = freq;
            } else if (freq == maxFreq) {
                totalCount += freq;
            }

            i = last + 1; // Move to the next new element
        }

        return totalCount;
    }

    static int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    static int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
