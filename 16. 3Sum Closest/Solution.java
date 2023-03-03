import java.lang.Math;
import java.util.*;
public class Solution {
  public static void main (String[] args) {
    Solution solution = new Solution();

    int[] nums = new int[] {1,1,1,0};
    int target = -100;

    System.out.println(solution.threeSumClosest(nums, target));

  }

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closest = 0;
    int minDiff = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        int diff = Math.abs(sum - target);

        if (diff < minDiff) {
          closest = sum;
          minDiff = diff;
        }

        if (sum < target) {
          left++;
        } else {
          right--;
        }

      }
    }
    return closest;
  }
}
