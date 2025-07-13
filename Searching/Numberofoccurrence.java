class Numberofoccurrence{
    static int lowerbound(int[] arr,int target){
        int res = arr.length;
        int lo = 0 , hi = arr.length - 1;
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid]>=target){
                res = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return res;
    }
    static int upperbound(int[] arr,int target){
        int res = arr.length;
        int lo = 0 , hi = arr.length - 1;
        while(lo<=hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid]>target){
                res = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return res;
    }
    static int countFreq(int[] arr, int target){
        return upperbound(arr,target) - lowerbound(arr,target);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int target = 2;
        System.out.println("Number of occurrences of " + target + " is: " + countFreq(arr,target));
    }
}