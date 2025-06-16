class MaxCircularSubarraySum{
    public int circularSubarraySum(int arr[]){
        int n = arr.length;
        int totalSum = 0;
        int currMax = 0;
        int currMin = 0;
        int maxKadane = Integer.MIN_VALUE;
        int minKadane = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){

            currMax = Math.max(arr[i],currMax+arr[i]);
            maxKadane = Math.max(maxKadane,currMax);

            currMin = Math.min(arr[i],currMin+arr[i]);
            minKadane = Math.min(minKadane,currMin);

            totalSum += arr[i];
        }

        if(maxKadane<0) return maxKadane;

        return Math.max(maxKadane,totalSum-minKadane);
    }
    public static void main(String[] args){
        MaxCircularSubarraySum mcs = new MaxCircularSubarraySum();
        int[] arr = {5, -2, 3, 4};
        System.out.println("Maximum Circular Subarray Sum: " + mcs.circularSubarraySum(arr)); // Output: 12
    }
}