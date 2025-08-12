class TrappingRainWater{
    public int maxWater(int arr[]){
        int res=0,left=1,right=arr.length-2;
        int lmax=arr[left-1];
        int rmax=arr[right+1];
        while(left<=right){
            if(rmax<=lmax){
                res+=Math.max(0,rmax-arr[right]);
                rmax=Math.max(rmax,arr[right]);
                right--;
            }
            else{
                res+=Math.max(0,lmax-arr[left]);
                lmax=Math.max(lmax,arr[left]);
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TrappingRainWater trw = new TrappingRainWater();
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Maximum water that can be trapped is: " + trw.maxWater(arr));
    }
}