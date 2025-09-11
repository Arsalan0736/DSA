class MinimumJumps{
    public int minJumps(int[] arr){
        int n=arr.length;
        if(n==1) return 0;
        if(arr[0]==0) return -1;
        int jumps=0,end=0,farthest=0;
        for(int i=0;i<n-1;i++){
            farthest=Math.max(farthest,i+arr[i]);
            if(i==end){
                jumps++;
                end=farthest;
                if(end>=n-1) return jumps;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        MinimumJumps mj=new MinimumJumps();
        System.out.println(mj.minJumps(new int[]{2,3,1,1,4}));
}
}