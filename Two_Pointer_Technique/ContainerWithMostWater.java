class ContainerWithMostWater{
    public int maxWater(int arr[]){
        int res=0;
        int left=0,right=arr.length-1;
        while(left<right){
            int water=Math.min(arr[left],arr[right])*(right-left);
            res=Math.max(res,water);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return res;
    }
    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be contained: " + container.maxWater(heights));
    }
}