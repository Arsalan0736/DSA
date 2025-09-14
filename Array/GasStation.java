class GasStation{
    public int startStation(int[] gas, int[] cost){
        int n=gas.length;
        int totalGas=0,tank=0,start=0;
        for(int i=0;i<n;i++){
            int net=gas[i]-cost[i];
            totalGas+=net;
            tank+=net;
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        return totalGas>=0?start:-1;
    }
    public static void main(String[] args){
        GasStation gs=new GasStation();
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(gs.startStation(gas,cost));
    }
}