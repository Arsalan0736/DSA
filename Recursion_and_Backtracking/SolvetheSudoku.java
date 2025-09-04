class SolvetheSudoku{
    static boolean isSafe(int[][] mat,int i,int j,int num,int[] row,int[] col,int[] box){
        if((row[i]&(1<<num))!=0 || (col[j]&(1<<num))!=0 || (box[i/3*3+j/3]&(1<<num))!=0)
            return true;
        return false;
    }
    static boolean solveSudokoRec(int[][] mat,int i,int j,int[] row,int[] col,int[] box){
        int n=mat.length;
        if(i==n-1&&j==n)
            return true;
        if(j==n){
            i++;
            j=0;
        }
        if(mat[i][j]!=0)
            return solveSudokoRec(mat,i,j+1,row,col,box);
        for(int num=1;num<=n;num++){
            if(isSafe(mat,i,j,num,row,col,box)){
                mat[i][j]=num;
                row[i]|=(1<<num);
                col[j]|=(1<<num);
                box[i/3*3+j/3]|=(1<<num);
                if(solveSudokoRec(mat,i,j+1,row,col,box))
                    return true;
                mat[i][j]=0;
                row[i]&=~(1<<num);
                col[j]&=~(1<<num);
                box[i/3*3+j/3]&=~(1<<num);
            }
        }
        return false;
    }
    static void solveSudoku(int[][] mat){
        int n=mat.length;
        int[] row=new int[n];
        int[] col=new int[n];
        int[] box=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=0){
                    row[i]|=(1<<mat[i][j]);
                    col[j]|=(1<<mat[i][j]);
                    box[(i/3)*3+j/3]|=(1<<mat[i][j]);
                }
            }
        }
        solveSudokoRec(mat,0,0,row,col,box);  
    }
    public static void main(String[] args) {
        int[][] mat={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        solveSudoku(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}