import java.util.*;

public class Solution {
  public static void main (String[] args) {
    Solution solution = new Solution();

    int[] nums = new int[] {-1,0,1,2,-1,-4};
    List<List<Integer>> list = solution.threeSum(nums);
    list.forEach(System.out::println);

  }

  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> output = new HashSet<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          List<Integer> list = new ArrayList<>();
          list.add(nums[i]);
          list.add(nums[j]);
          list.add(nums[k]);
          output.add(list);
          j++;
          k--;
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }
    }
    return new ArrayList<>(output);
  }
}
