class ReverseArray{
    public void reverseArray(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args){
        int arr[]={2,5,1,4,2,7};
        ReverseArray reverse = new ReverseArray();
        reverse.reverseArray(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}