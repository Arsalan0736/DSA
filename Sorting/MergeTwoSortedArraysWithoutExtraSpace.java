class MergeTwoSortedArraysWithoutExtraSpace{
    public void mergeArrays(int a[], int b[]){
        int n=a.length;
        int m=b.length;
        int gap=(n+m+1)/2;
        while(gap>0){
            int i=0,j=gap;
            while(j<n+m){
                if(j<n&&a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }else if(i<n&&j>=n&&a[i]>b[j-n]){
                    int temp=a[i];
                    a[i]=b[j-n];
                    b[j-n]=temp;
                }else if(i>=n&&b[i-n]>b[j-n]){
                    int temp=b[i-n];
                    b[i-n]=b[j-n];
                    b[j-n]=temp;
                }
                i++;
                j++;
            }
            if(gap==1) break;
            gap=(gap+1)/2;
        }
    }
    public static void main(String[] args) {
        MergeTwoSortedArraysWithoutExtraSpace obj = new MergeTwoSortedArraysWithoutExtraSpace();
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6, 8};
        obj.mergeArrays(a, b);
        System.out.print("Merged arrays: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}