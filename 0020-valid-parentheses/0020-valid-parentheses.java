class Solution {
    public boolean isValid(String s) {
       Stack<String>stack=new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='('){
            stack.push(")");
        }
        else if(ch=='{'){
            stack.push("}");
        }
        else if(ch=='[')
        {
          stack.push("]");
        }
       
       else{
        if(stack.isEmpty() || !stack.pop().equals(String.valueOf(ch))){
            return false;
        }
       }
       }
       return stack.isEmpty();
    }
}