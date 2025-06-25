import java.util.ArrayList;
class SearchPatternKMPAlgorithm{
    ArrayList<Integer> search(String pat, String txt){
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        int[] lps = computeLPS(pat);
        int i=0,j=0;
        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                result.add(i-j);
                j = lps[j-1];
            }else if(i<n&&txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return result;
    }
    private int[] computeLPS(String pat){
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0;
        int i=1;
        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0) len = lps[len-1];
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static void main(String[] args) {
        SearchPatternKMPAlgorithm kmp = new SearchPatternKMPAlgorithm();
        String txt = "ababcabcabababd";
        String pat = "ababd";
        ArrayList<Integer> result = kmp.search(pat, txt);
        System.out.println("Pattern found at indices: " + result);
    }
}