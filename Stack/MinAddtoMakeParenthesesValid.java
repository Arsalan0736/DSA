class MinAddtoMakeParenthesesValid{
    public int minParentheses(String s){
        int b=0,u=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                b++;
            }else{
                if(b>0){
                    b--;
                }
                else{
                    u++;
                }
            }
        }
        return b+u;
    }
    public static void main(String[] args) {
        System.out.println(new MinAddtoMakeParenthesesValid().minParentheses("())"));
    }
}