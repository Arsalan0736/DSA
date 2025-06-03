class AllZeroToRightEnd{

    void pushZerosToEnd(int[] arr){
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }

    public static void main(String[] args){
        int arr[]={1,2,0,3,4,0,2};
        AllZeroToRightEnd zeros = new AllZeroToRightEnd();
        zeros.pushZerosToEnd(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}