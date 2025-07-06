import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class OverlappingIntervals{
    public List<int[]> mergeOverlap(int[][] arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(new int[]{arr[0][0],arr[0][1]});
        for(int i=0;i<arr.length;i++){
            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];
            if(curr[0]<last[1]) last[1]=Math.max(curr[1],last[1]);
            else res.add(new int[]{curr[0],curr[1]});
        }
        return res;
    }
    public static void main(String[] args){
        OverlappingIntervals oi = new OverlappingIntervals();
        int[][] intervals = {{1,3},{2,4},{5,7},{6,8}};
        List<int[]> merged = oi.mergeOverlap(intervals);
        for(int[] interval : merged){
            System.out.println(Arrays.toString(interval));
        }
    }
}