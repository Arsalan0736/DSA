class Anagram{
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s1.length()) return false;
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            count[s2.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if(areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}