import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
class TwoSum{
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[] = {2,7,13,5};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}