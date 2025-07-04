class NextPermutation{
    void nextPermutation(int[] arr){
        int n=arr.length;
        int i=n-2;
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(j>=0&&arr[j]<arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int arr[]= {2, 4, 1, 7, 5, 0};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(arr);
        System.out.print("Next Permutation: ");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}