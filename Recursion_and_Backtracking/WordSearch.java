class WordSearch{
    static boolean findMatch(char[][] mat,String word,int x,int y,int wIdx){
        int wLen=word.length();
        int n=mat.length;
        int m=mat[0].length;
        if(wIdx==wLen) return true;
        if(x<0||y<0||x>=n||y>=m) return false;
        if(mat[x][y]==word.charAt(wIdx)){
            char temp=mat[x][y];
            mat[x][y]='#';
            boolean res=findMatch(mat,word,x-1,y,wIdx+1)||
                        findMatch(mat,word,x+1,y,wIdx+1)||
                        findMatch(mat,word,x,y-1,wIdx+1)||
                        findMatch(mat,word,x,y+1,wIdx+1);
            mat[x][y]=temp;
            return res;
        }
        return false;
    }
    static public boolean isWordExist(char[][] mat, String word){
        int wLen=word.length();
        int n=mat.length;
        int m=mat[0].length;
        if(wLen>n*m) return false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(findMatch(mat,word,i,j,0))
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] mat={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word="ABCCED";
        System.out.println(isWordExist(mat,word));
    }
}