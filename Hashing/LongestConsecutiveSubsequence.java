import java.util.*;
class LongestConsecutiveSubsequence{
    public int longestConsecutive(int[] arr){
        Set<Integer> st = new HashSet<>();
        int res=0;
        for(int val:arr){
            st.add(val);
        }
        for(int val:arr){
            if(st.contains(val)&&!st.contains(val-1)){
                int cur=val,cnt=0;
                while(st.contains(cur)){
                    st.remove(cur);
                    cur++;
                    cnt++;
                }
                res=Math.max(res,cnt);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        LongestConsecutiveSubsequence lcs = new LongestConsecutiveSubsequence();
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of Longest Consecutive Subsequence: " + lcs.longestConsecutive(arr));
    }
}