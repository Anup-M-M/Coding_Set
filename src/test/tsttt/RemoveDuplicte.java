package test.tsttt;

public class RemoveDuplicte {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        int result = printduplicate(nums);
        System.out.println(result);

    }

    private static int printduplicate(int[] nums) {

        if(nums == null || nums.length == 0){
            return -1;
        }

        int i = 0;

        for(int n : nums){
            if( i < 1 || n != nums[i - 1]){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }
}
