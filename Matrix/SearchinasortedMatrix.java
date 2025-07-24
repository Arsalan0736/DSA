class SearchinasortedMatrix{
    public boolean searchMatrix(int[][] mat, int x){
        int n=mat.length,m=mat[0].length,lo=0,hi=m*n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==x) return true;
            if(mat[row][col]<x) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        SearchinasortedMatrix obj = new SearchinasortedMatrix();
        int[][] mat = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60},
            {60, 61, 62, 63}
        };
        int x = 3;
        System.out.println(obj.searchMatrix(mat, x)); // Output: true
    }
}