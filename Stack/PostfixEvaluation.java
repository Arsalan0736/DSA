import java.util.Stack;
class PostfixEvaluation{
    public int evaluatePostfix(String[] arr){
        Stack<Integer> stack=new Stack<>();
        for(String token:arr){
            if(isOperator(token)){
                int b=stack.pop();
                int a=stack.pop();
                int result=0;
                switch(token){
                    case "+":result=a+b;break;
                    case "-":result=a-b;break;
                    case "*":result=a*b;break;
                    case "/":result=(int)Math.floor((double)a/b);break;
                    case "^":result=(int)Math.pow(a,b);break;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    private boolean isOperator(String token){
        return 
                token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ||
                token.equals("^");
    }
    public static void main(String[] args){
        PostfixEvaluation pe=new PostfixEvaluation();
        String[] arr={"2","1","+","3","*"};
        System.out.println(pe.evaluatePostfix(arr)); // Output: 9
    }
}