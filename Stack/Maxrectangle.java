import java.util.*;
class Maxrectangle{
    static int largestRectangleArea(int[] heights){
        int n=heights.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            left[i]=(st.isEmpty()?-1:st.peek());
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i]=(st.isEmpty()?n:st.peek());
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=right[i]=left[i]-1;
            maxArea=Math.max(maxArea,heights[i]*width);
        }
        return maxArea;
    }
    static int maxArea(int mat[][]){
        int n=mat.length,m=mat[0].length;
        int maxArea=0;
        int[] height=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) height[j]=0;
                else height[j]+=1;
            }
            maxArea=Math.max(maxArea,largestRectangleArea(height));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {0, 1, 1, 0},
            {1, 0, 0, 1}
        };
        System.out.println("Maximum area of rectangle with all 1s: " + maxArea(mat));
    }
}