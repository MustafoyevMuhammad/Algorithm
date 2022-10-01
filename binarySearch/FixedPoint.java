package binarySearch;

public class FixedPoint {
//    public static int solve(int[] nums) {
//        if (nums == null) return -1;
//        int n = nums.length;
//        int start = 0, end = n - 1;
//        int mid = 0;
//        while (start <= end) {
//            mid = (start + end) >> 1;
//            if (nums[mid] > mid)
//                end = mid - 1;
//            else if (nums[mid] < mid)
//                start = mid + 1;
//            if (mid - 1 < 0 ) {
//                if(mid==0&&nums[mid]==mid)return mid;
//            }
//            else if (nums[mid] == mid && nums[mid - 1] != mid - 1) return mid;
//            else if (nums[mid - 1] == mid - 1) start = end = mid - 1;
//        }
//        /* If no fixed point present
//           then return -1 */
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr = {-1,1};
        System.out.println(find(arr,0,arr.length-1));
    }

    public static int find(int[] nums, int start, int end) {
        int mid = (start + end) >> 1;
        if (start == end) return nums[start] == start ? start : -1;
        else if (mid <= nums[mid]) return find(nums, start, mid);
        else return find(nums, mid+1, end);
    }
}
