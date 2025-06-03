class AllZeroToLeftEnd{

    void pushZerosToStart(int[] arr){
        int index = arr.length-1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]!=0){
                arr[index--]=arr[i];
            }
        }
        while(index>=0){
            arr[index--]=0;
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,0,3,4,0,2};
        AllZeroToLeftEnd zeros = new AllZeroToLeftEnd();
        zeros.pushZerosToStart(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}