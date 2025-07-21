class Rotateby90degree{
    public void rotateMatrix(int[][] mat){
        int n = mat.length;
        for(int i=0;i<n;i++){
            int start=0,end=n-1;
            while(start<end){
                int temp=mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
        public static void main(String[] args) {
            Rotateby90degree obj = new Rotateby90degree();
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            obj.rotateMatrix(matrix);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }