import java.util.ArrayList;
class Generateallbinarystrings{
    public ArrayList<String> binstr(int n){
        ArrayList<String> res = new ArrayList<>();
        generate("",n,res);
        return res;
    }
    private void generate(String curr,int n,ArrayList<String> res){
        if(curr.length()==n){
            res.add(curr);
            return;
        }
        generate(curr+"0",n,res);
        generate(curr+"1",n,res);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(new Generateallbinarystrings().binstr(n));
    }
}