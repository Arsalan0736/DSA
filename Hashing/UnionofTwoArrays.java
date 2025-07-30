import java.util.HashSet;
import java.util.ArrayList;
class UnionofTwoArrays{
    static ArrayList<Integer> findUnion(int[] a, int[] b){
        HashSet<Integer> st = new HashSet<>();
        for(int num:a){
            st.add(num);
        }
        for(int num:b){
            st.add(num);
        }
        ArrayList<Integer> res  = new ArrayList<>();
        for(int it:st){
            res.add(it);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {4, 5, 6, 7, 8};
        ArrayList<Integer> union = findUnion(a, b);
        System.out.println("Union of two arrays: " + union);
    }
}