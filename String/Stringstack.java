class Stringstack{
    public boolean stringStack(String pat, String tar){
        int i=pat.length()-1;
        int j=tar.length()-1;
        int deleteCount=0;
        while(i>=0){
            if(deleteCount>0){
                deleteCount--;
                i--;
            }else if(j>=0&&pat.charAt(i)==tar.charAt(j)){
                i--;
                j--;
            }else{
                deleteCount++;
                i--;
            }
        }
        return j<0;
    }
    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(new Stringstack().stringStack(s,t));
    }
}