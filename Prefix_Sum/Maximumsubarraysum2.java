import java.util.TreeMap;
class Maximumsubarraysum2{
    public int maxSubarrSum(int[] arr, int a, int b){
        int n=arr.length;
        long[] prefix=new long[n+1];
        TreeMap<Long,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++) prefix[i+1]=prefix[i]+arr[i];
        long ans=Long.MIN_VALUE;
        for(int r=1;r<=n;r++){
            if(r-a>=0) map.put(prefix[r-a],map.getOrDefault(prefix[r-a],0)+1);
            if(r-b-1>=0){
                long val=prefix[r-b-1];
                if(map.put(val,map.get(val)-1)==1) map.remove(val);
            }
            if(!map.isEmpty()) ans=Math.max(ans,prefix[r]-map.firstKey());
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        Maximumsubarraysum2 obj = new Maximumsubarraysum2();
        int[] arr = {1, 2, 3, 4, 5};
        int a = 1;
        int b = 3;
        int maxSum = obj.maxSubarrSum(arr, a, b);
        System.out.println("Maximum subarray sum between indices " + a + " and " + b + " is: " + maxSum);
    }
}