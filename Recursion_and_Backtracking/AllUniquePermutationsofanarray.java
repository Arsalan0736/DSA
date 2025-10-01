import java.util.ArrayList;
import java.util.Arrays;
class AllUniquePermutationsofanarray {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        backtrack(arr,used,new ArrayList<>(),result);
        return result;
    }
    private static void backtrack(int[] arr,boolean[] used,
        ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result){
           if(current.size()==arr.length){
               result.add(new ArrayList<>(current));
               return;
           } 
           for(int i=0;i<arr.length;i++){
               if(used[i]) continue;
               if(i>0&&arr[i]==arr[i-1]&&!used[i-1]) continue;
               used[i]=true;
               current.add(arr[i]);
               backtrack(arr,used,current,result);
               current.remove(current.size()-1);
               used[i]=false;
           }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        ArrayList<ArrayList<Integer>> result = uniquePerms(arr);
        for(ArrayList<Integer> perm : result){
            System.out.println(perm);
        }
    }
};