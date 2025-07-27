import java.util.Map;
import java.util.HashMap;
class Countpairswithgivensum{
    int countPairs(int arr[], int target){
        Map<Integer,Integer> freq = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(target-arr[i])){
                cnt+=freq.get(target-arr[i]);
            }
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Countpairswithgivensum obj = new Countpairswithgivensum();
        int arr[] = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println("Count of pairs with given sum: " + obj.countPairs(arr, target));
    }
}