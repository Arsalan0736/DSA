class RotateArray{
    static void rotateArr(int arr[], int d){
        int n = arr.length;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr={2,5,3,6,2,5,2};
        RotateArray r = new RotateArray();
        r.rotateArr(arr,3);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}