class Sort0s1sand2s{
    static void sort(int[] arr){
        int lo = 0;
        int mid = 0;
        int temp = 0;
        int hi = arr.length - 1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                lo++;
                mid++;
            }else if(arr[mid]==1) mid++;
            else{
                swap(arr,hi,mid);
                hi--;
            }
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}