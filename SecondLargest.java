class SecondLargest{

    public int getSecondLargest(int arr[]){
        int first = -1;
        int second  = -1;
        for (int num : arr){
            if (num > first){
                second = first;
                first = num;
            }
            else if (num > second && num < first){
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args){
        int arr[]={1,2,4,5,6};
        SecondLargest second = new SecondLargest();
        System.out.println(second.getSecondLargest(arr));
    }
}