import java.util.*;
class LongestBoundedDifferenceSubarray{
    public ArrayList<Integer> longestSubarray(int[] arr, int x){
        int n=arr.length;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int left=0,bestStart=0,bestLen=0;
        for(int right=0;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.lastKey()-map.firstKey()>x){
                int count=map.get(arr[left]);
                if(count==1) map.remove(arr[left]);
                else map.put(arr[left],count-1);
                left++;
            }
            if(right-left+1>bestLen){
                bestLen=right-left+1;
                bestStart=left;
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=bestStart;i<bestStart+bestLen;i++){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args){
        LongestBoundedDifferenceSubarray obj = new LongestBoundedDifferenceSubarray();

        int[] arr1 = {8, 4, 5, 6, 7};
        int x1 = 3;
        System.out.println("Result 1: " + obj.longestSubarray(arr1, x1)); 
        // Expected: [4, 5, 6, 7]

        int[] arr2 = {1, 10, 12, 13, 14};
        int x2 = 2;
        System.out.println("Result 2: " + obj.longestSubarray(arr2, x2)); 
    }
}