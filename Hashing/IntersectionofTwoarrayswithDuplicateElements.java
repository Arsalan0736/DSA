import java.util.HashSet;
import java.util.ArrayList;
class IntersectionofTwoarrayswithDuplicateElements{
    public ArrayList<Integer> intersect(int[] a, int[] b){
        HashSet<Integer> sa  = new HashSet<>();
        for(int num:a){
            sa.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:b){
            if(sa.contains(num)){
                res.add(num);
                sa.remove(num);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        IntersectionofTwoarrayswithDuplicateElements obj = new IntersectionofTwoarrayswithDuplicateElements();
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        ArrayList<Integer> result = obj.intersect(a, b);
        System.out.println(result); // Output: [2]
    }
}