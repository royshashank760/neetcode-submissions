class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
         
         // combine both array position and speed
        int[][] combine = new int[position.length][2];
        for(int i=0; i<position.length;i++){
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
         
         //sort wrt position
        Arrays.sort(combine,java.util.Comparator.comparing(obj -> obj[0]));
         
         //iterate from last position to first
        for(int i=combine.length-1; i>=0;i--){

            //calculate time taken by that car
           double time = (double)(target - combine[i][0]) / combine[i][1];

           //if that current car takes less time than one is top of stack then we will skip
            if(!stack.isEmpty() && time <= stack.peek()){
                continue;
            }

            //if the current time is higher we will add to stack
            else {
                stack.add(time);
            }
            
        }
        return stack.size();
    }
}
