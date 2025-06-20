class Solution {
    public int myAtoi(String s) {
        // Your code here
        int n=s.length(),i=0;
        int sign=1;
        long result = 0;
        while(i<n&&s.charAt(i)==' '){
            i++;
        }
        if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n&&Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            result = result * 10 + digit;
            if(sign==1&&result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(sign==-1&& -result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*result);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "   -42";
        int result = solution.myAtoi(s);
        System.out.println("The converted integer is: " + result); // Output: -42
    }
}