class SearchinaRowColumnsortedmatrix{
    static boolean matSearch(int[][] mat, int x){
        int n=mat.length,m=mat[0].length;
        int i=0,j=m-1;
        while(i<n&&j>=0){
            if(x>mat[i][j]) i++;
            else if(x<mat[i][j]) j--;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int x = 29;
        if (matSearch(mat, x)) {
            System.out.println("Element found in the matrix");
        } else {
            System.out.println("Element not found in the matrix");
        }
    }
}