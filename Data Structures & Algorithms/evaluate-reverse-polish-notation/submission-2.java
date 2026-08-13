class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String chars : tokens){
            if(chars.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            

            else if(chars.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(chars.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
           else if(chars.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }

            else{
                stack.push(Integer.parseInt(chars));
            }
            
        }

        return stack.pop();
        
            
        
    }
}
