class MaximumProductSubarray{
    int maxProduct(int[] arr){
        int maxSoFar = arr[0];
        int max_ending_here = arr[0];
        int min_ending_here = arr[0];
        for (int i=1;i<arr.length;i++){
            int temp = max_ending_here;
            max_ending_here = Math.max(arr[i],Math.max(arr[i]*max_ending_here, arr[i]*min_ending_here));
            min_ending_here = Math.min(arr[i]*temp,arr[i]*min_ending_here);
            maxSoFar = Math.max(maxSoFar, max_ending_here);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + mps.maxProduct(arr)); // Output: 6
    }
}