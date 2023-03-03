public class Solution {
  public static void main (String[] args) {
    int[] nums1 = new int[] {1,3};
    int[] nums2 = new int[] {2};
    System.out.println(findMedianSortedArrays(nums1, nums2));
  }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = ((nums1.length + nums2.length) / 2) + 1;

        int[] arr = new int[size];
        int first = 0;
        int second = 0;

        for (int i = 0; i < size; i++) {
            if (first == nums1.length) {
                arr[i] = nums2[second++];
            } else if (second == nums2.length) {
                arr[i] = nums1[first++];
            } else {
                if (nums1[first] < nums2[second]) {
                    arr[i] = nums1[first++];
                } else {
                    arr[i] = nums2[second++];
                }
            }
        }

        if((nums1.length + nums2.length) % 2 == 0) {
            return (double)(arr[size - 1] + arr[size - 2]) / 2;
        } else {
            return (double) arr[size-1];
        }
    }
}
