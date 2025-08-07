class Pairwithgivensuminasortedarray{
    int countPairs(int arr[], int target){
        int res=0;
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]<target) left++;
            else if(arr[left]+arr[right]>target) right--;
            else{
                int cnt1=0,cnt2=0;
                int ele1=arr[left],ele2=arr[right];
                while(left<=right&&arr[left]==ele1){
                    left++;
                    cnt1++;
                }
                while(left<=right&&arr[right]==ele2){
                    right--;
                    cnt2++;
                }
                if(ele1==ele2) res+=(cnt1*(cnt1-1))/2;
                else res+=(cnt1*cnt2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Pairwithgivensuminasortedarray obj = new Pairwithgivensuminasortedarray();
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 7;
        System.out.println("Number of pairs with sum " + target + ": " + obj.countPairs(arr, target));
    }
}