class MinimumKConsecutiveBitFlips{
    public int kBitFlips(int[] arr, int k){
        int n=arr.length,flips=0,flip=0;
        for(int i=0;i<n;i++){
            if(i>=k) flip-=arr[i-k]/2;
            if((arr[i]+flip)%2==0){
                if(i+k>n) return -1;
                flips++;
                flip++;
                arr[i]+=2;
            }
        }
        return flips;
    }
    public static void main(String args[]){
        MinimumKConsecutiveBitFlips obj=new MinimumKConsecutiveBitFlips();
        System.out.println(obj.kBitFlips(new int[]{0,0,0,1},3));
    }
}