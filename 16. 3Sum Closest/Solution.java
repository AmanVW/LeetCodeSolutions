public class Solution {
  public static void main (String[] args) {
    Solution solution = new Solution();

    int[] nums = new int[] {-1,2,1,-4};
    int target = 1;

    System.out.println(solution.threeSumClosest(nums, target));

  }

  public int threeSumClosest(int[] nums, int[] target) {
    Arrays.sort(nums);

    // -4 -1 1 2
  }
}
