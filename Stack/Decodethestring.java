import java.util.Stack;
class Decodethestring{
    static String decodeString(String s){
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                countStack.push(k);
                stringStack.push(current);
                current=new StringBuilder();
                k=0;
            }else if(c==']'){
                int repeatTimes=countStack.pop();
                StringBuilder decoded=stringStack.pop();
                for(int i=0;i<repeatTimes;i++){
                    decoded.append(current);
                }
                current=decoded;
            }else{
                current.append(c);
            }
        }
        return current.toString();
    }
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
}