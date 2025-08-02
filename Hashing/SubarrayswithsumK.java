import java.util.Map;
import java.util.HashMap;
class SubarrayswithsumK{
    public int cntSubarrays(int[] arr, int k){
        Map<Integer,Integer> prefixSums = new HashMap<>();
        int curSum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            curSum += arr[i];
            if(curSum==k){
                res++;
            }
            if(prefixSums.containsKey(curSum-k)){
                res+=prefixSums.get(curSum-k);
            }
            prefixSums.put(curSum,prefixSums.getOrDefault(curSum,0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        SubarrayswithsumK obj = new SubarrayswithsumK();
        int[] arr = {1, 2, 3, -2, 5};
        int k = 3;
        System.out.println("Count of subarrays with sum " + k + ": " + obj.cntSubarrays(arr, k));
    }
}