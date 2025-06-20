// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        
        int i = s1.length()-1;
        int j = s2.length()-1;
        int carry = 0;
        
        while ( i >= 0 || j >= 0 || carry == 1 ){
            
            int sum = carry;
            
            if ( i >= 0 ){
                sum += s1.charAt(i--) - '0';
            }
            
            if ( j >= 0 ){
                sum += s2.charAt(j--) - '0';
            }
            
            result.append( sum % 2 );
            
            carry = sum / 2;
        }
        while ( result.length() > 1 && result.charAt(result.length()-1) == '0' ){
            result.setLength(result.length()-1);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addBinary("1101", "1011")); // Output: "11000"
    }
}