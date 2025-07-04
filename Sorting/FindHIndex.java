class FindHIndex{
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>=n) freq[n]++;
            else freq[citations[i]]++;
        }
        int idx = n;
        int s = freq[n];
        while(s<idx){
            idx--;
            s+=freq[idx];
        }
        return idx;
    }
    public static void main(String[] args){
        int[] citations={6,5,3,1,0};
        System.out.println(new FindHIndex().hIndex(citations));
    }
}