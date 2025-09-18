import java.util.*;
class GreaterElementinCircularArray{
    public ArrayList<Integer> nextGreater(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            int num=arr[i%n];
            while(!stack.isEmpty()&&arr[stack.peek()]<num){
                res[stack.pop()]=num;
            }
            if(i<n) stack.push(i);
        }
        ArrayList<Integer> result=new ArrayList<>(n);
        for(int val:res) result.add(val);
        return result;
    }
    public static void main(String[] args) {
        GreaterElementinCircularArray obj=new GreaterElementinCircularArray();
        int[] arr={1,2,1};
        System.out.println(obj.nextGreater(arr));
    }
}