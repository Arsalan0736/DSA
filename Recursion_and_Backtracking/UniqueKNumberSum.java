import java.util.ArrayList;
class UniqueKNumberSum{
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(1,k,n,new ArrayList<>(),res);
        return res;
    }
    private void dfs(int start,int k,int target,ArrayList<Integer> path,
        ArrayList<ArrayList<Integer>> res){
            if(k==0){
                if(target==0) res.add(new ArrayList<>(path));
                return;
            }
            for(int i=start;i<9;i++){
                path.add(i);
                dfs(i+1,k-1,target-i,path,res);
                path.remove(path.size()-1);
            }
        }
    public static void main(String[] args) {
        UniqueKNumberSum uks = new UniqueKNumberSum();
        System.out.println(uks.combinationSum(7,3));
    }
}