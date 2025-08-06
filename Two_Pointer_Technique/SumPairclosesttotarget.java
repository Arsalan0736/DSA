import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class SumPairclosesttotarget{
    public List<Integer> sumClosest(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        int left = 0 , right = n - 1;
        while(left<right){
            int curSum = arr[left] + arr[right];
            if(Math.abs(target-curSum)<minDif){
                minDif=Math.abs(target-curSum);
                res=Arrays.asList(arr[left],arr[right]);
            }
            if(curSum<target) left++;
            else if(curSum>target) right--;
            else return res;
        }
        return res;
    }
    public static void main(String[] args) {
        SumPairclosesttotarget obj = new SumPairclosesttotarget();
        int[] arr = {1, 3, 4, 7, 10};
        int target = 15;
        List<Integer> result = obj.sumClosest(arr, target);
        System.out.println("Pair closest to target: " + result);
    }
}