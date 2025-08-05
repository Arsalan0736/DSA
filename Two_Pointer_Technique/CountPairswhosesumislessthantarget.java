import java.util.Arrays;
class CountPairswhosesumislessthantarget{
    int countPairs(int arr[], int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int cnt = 0;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum < target){
                cnt += right - left;
                left++;
            }
            else{
                right--;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        CountPairswhosesumislessthantarget obj = new CountPairswhosesumislessthantarget();
        int arr[] = {1, 2, 3, 4, 5};
        int target = 7;
        System.out.println("Count of pairs with sum less than " + target + " is: " + obj.countPairs(arr, target));
    }
}