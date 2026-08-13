// MAJORITY ELEMENT
public class leetcode_169_ {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return -1; // This line is unreachable due to the problem's assumption.
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums2)); // Output: 2
    }
}
