import java.util.HashMap;
class Largestsubarrayof0sand1s{
    public int maxLen(int[] arr){
        int res=0,prefSum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefSum+=(arr[i]==0) ? -1 : 1;
            if(prefSum==0) res=i+1;
            if(mp.containsKey(prefSum))
                res=Math.max(res,i-mp.get(prefSum));
            else
                mp.put(prefSum,i);
        }
        return res;
    }
    public static void main(String[] args) {
        Largestsubarrayof0sand1s obj = new Largestsubarrayof0sand1s();
        int[] arr = {0, 1, 0, 1, 1, 0};
        System.out.println("Length of the largest subarray with equal number of 0's and 1's: " + obj.maxLen(arr));
    }
}