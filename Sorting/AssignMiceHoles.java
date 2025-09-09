import java.util.Arrays;
class AssignMiceHoles{
    public int assignHole(int[] mices, int[] holes){
        Arrays.sort(mices);
        Arrays.sort(holes);
        int maxTime=0;
        for(int i=0;i<mices.length;i++){
            maxTime=Math.max(maxTime,Math.abs(mices[i]-holes[i]));
        }
        return maxTime;
    }
    public static void main(String args[]){
        AssignMiceHoles obj=new AssignMiceHoles();
        System.out.println(obj.assignHole(new int[]{4,-4,2},new int[]{4,0,5}));
    }
}