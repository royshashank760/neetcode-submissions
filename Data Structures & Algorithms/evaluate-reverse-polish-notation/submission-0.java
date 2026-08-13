class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String chars : tokens){
            if(chars.equals("-")){
                stack.push(stack.pop()-stack.pop());
            }
            

            else if(chars.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(chars.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
           else if(chars.equals("/")){
                stack.push(stack.pop()/stack.pop());
            }

            else{
                stack.push(Integer.parseInt(chars));
            }
            
        }

        return stack.pop();
        
            
        
    }
}
