package class04顺序;

/**
 * @author:hyj
 * @date:2022/10/13
 */
public class code01寻找两个数组的中位数 {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2, 3};
        int l = 0, r = 0, i = 0;
        int[] help = new int[nums1.length + nums2.length];
        while (l < nums1.length && r < nums2.length) {
            help[i++] = nums1[l] <= nums2[r] ? nums1[l++] : nums2[r++];
        }
        while (l < nums1.length) {
            help[i++] = nums1[l++];
        }
        while (r < nums2.length) {
            help[i++] = nums2[r++];
        }
        if (help.length % 2 != 0) {
            System.out.println((double) help[help.length / 2]);
        } else {
            System.out.println((double) (help[help.length / 2] + help[help.length / 2 - 1]) / 2);
        }
    }


}
