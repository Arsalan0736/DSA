import java.util.Arrays;
class MinimumCosttocutaboardintosquares{
    public static int minCost(int n, int m, int[] x, int[] y){
        Arrays.sort(x);
        Arrays.sort(y);
        reverse(x);
        reverse(y);
        int i=0,j=0,h=1,v=1,cost=0;
        while(i<x.length&&j<y.length){
            if(x[i]>=y[j]){
                cost+=x[i]*v;
                h++;
                i++;
            }else{
                cost+=y[j]*h;
                v++;
                j++;
            }
        }
        while(i<x.length){
            cost+=x[i]*v;
            i++;
        }
        while(j<y.length){
            cost+=y[j]*h;
            j++;
        }
        return cost;
    }
    public static void reverse(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String args[]){
        int n=4,m=6,x[]={2,1,3,1},y[]={2,1,2};
        System.out.println(minCost(n,m,x,y));
    }
}