import java.util.Map;
import java.util.HashMap;
class LongestSubarraywithSumK{
    public int longestSubarray(int[] arr, int k){
        int res=0,prefSum=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            if(prefSum==k) res=i+1;
            else if(mp.containsKey(prefSum-k)) res=Math.max(res,i-mp.get(prefSum-k));
            if(!mp.containsKey(prefSum)) mp.put(prefSum,i);
        }
        return res;
    }
    public static void main(String[] args) {
        LongestSubarraywithSumK obj = new LongestSubarraywithSumK();
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Length of longest subarray with sum " + k + " is: " + obj.longestSubarray(arr, k));
    }
}