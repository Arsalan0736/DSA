import java.util.Arrays;
class MinimizetheHeightsI{
    int getMinDiff(int[] arr,int k){
        int n = arr.length;
        Arrays.sort(arr);
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        int ans = arr[n-1]+arr[0];
        for(int i =1;i<n;i++){
            int minVal=Math.min(smallest,arr[i]-k);
            int maxVal=Math.max(largest,arr[i-1]+k);
            ans=Math.min(ans,maxVal-minVal);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 10};
        MinimizetheHeightsI m = new MinimizetheHeightsI();
        int a = m.getMinDiff(arr,2);
        System.out.print(a);
    }
}