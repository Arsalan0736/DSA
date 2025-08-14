class Equilibrium_Point{
    public static int findEquilibrium(int arr[]){
        int prefSum=0,total=0;
        for(int ele:arr) total+=ele;
        for(int pivot=0;pivot<arr.length;pivot++){
            int sufSum=total-prefSum-arr[pivot];
            if(prefSum==sufSum) return pivot;
            prefSum+=arr[pivot];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int ans=findEquilibrium(arr);
        if(ans==-1) System.out.println("No Equilibrium Point");
        else System.out.println("Equilibrium Point at index: "+ans);
    }
}