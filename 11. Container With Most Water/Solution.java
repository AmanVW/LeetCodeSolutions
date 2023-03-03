import java.lang.Math;

public class Solution {
  public static void main (String[] args) {
    Solution solution = new Solution();

    int[] height = new int[] {1,1};

    System.out.println(solution.maxArea(height));
  }

  public int maxArea(int[] height) {
    int i = 0;
    int j = height.length - 1;

    int max = 0;

    while (i < j) {

      if (height[i] > height[j]) {
        int area = height[j] * (j - i);
        max = Math.max(area, max);
        j--;
      } else if (height[i] < height[j]) {
        int area = height[i] * (j - i);
        max = Math.max(area, max);
        i++;
      } else {
        int area = height[i] * (j - i);
        max = Math.max(area, max);
        if (height[i + 1] < height[j - 1]) {
          j--;
        } else {
          i++;
        }
      }

    }
    return max;
  }
}
