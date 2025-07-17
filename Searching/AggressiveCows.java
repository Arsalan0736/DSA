import java.util.Arrays;
class AggressiveCows{
    static boolean check(int[]stalls,int k,int dist){
        int cnt = 1;
        int prev  = stalls[0];
        for (int i=1;i<stalls.length;i++){
            if(stalls[i]-prev>=dist){
                prev=stalls[i];
                cnt+=1;
            }
        }
        return (cnt>=k);
    }
    static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int res  = 0;
        int lo = 1;
        int hi = stalls[stalls.length-1]-stalls[0];
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(check(stalls,k,mid)){
                res = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3; // Number of cows
        System.out.println("Maximum distance: " + aggressiveCows(stalls, k));
    }
} 