class Solution {
    public boolean isValidSudoku(char[][] board) {
         int N = 9;
        HashSet<Character> [] rows = new HashSet[N];
        HashSet<Character> [] cols = new HashSet[N];
        HashSet<Character> [] boxes = new HashSet[N];

        for(int r =0; r<N; r++){
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                char value = board[r][c];

                if(value == '.'){
                    continue;
                }

                if(rows[r].contains(value)){
                    return false;
                }
                rows[r].add(value);
                
                if(cols[c].contains(value)){
                    return false;
                }
                cols[c].add(value);

                int index = (r/3) * 3 + c/3;
                if(boxes[index].contains(value)){
                    return false;
                }
                boxes[index].add(value);
            }

        }
        return true;
    }
}
