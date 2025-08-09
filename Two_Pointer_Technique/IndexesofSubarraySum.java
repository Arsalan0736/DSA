import java.util.ArrayList;
class IndexesofSubarraySum{
    static ArrayList<Integer> subarraySum(int[] arr, int target){
        int s=0,e=0;
        ArrayList<Integer> res = new ArrayList<>();
        int cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if(cur>=target){
                e=i;
                while(cur>target&&s<e){
                    cur-=arr[s];
                    ++s;
                }
                if(cur==target){
                    res.add(s+1);
                    res.add(e+1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        if (result.size() == 2) {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }
}