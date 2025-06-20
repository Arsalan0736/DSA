import java.util.Arrays;
class MinimizetheHeightsII{
    int getMinDiff(int[] arr, int k){
        int n = arr.length;

        Arrays.sort(arr);

        int ans = arr[n-1]-arr[0];

        int smallest = arr[0]+k;

        int largest = arr[n-1]-k;

        for ( int i=1;i<n;i++ ){
            if ( arr[i]-k<0 ) continue;

            int minVal = Math.min(smallest,arr[i]-k);
            int maxVal = Math.max(largest,arr[i-1]+k);

            ans = Math.min(ans,maxVal-minVal);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 8, 10};
        MinimizetheHeightsII m = new MinimizetheHeightsII();
        int a = m.getMinDiff(arr,2);
        System.out.print(a);
    }
}