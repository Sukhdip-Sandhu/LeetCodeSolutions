class Solution {
    public boolean judgeCircle(String moves) {
        byte LR = 0;
        byte UD = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                UD++;
            } else if (moves.charAt(i) == 'D') {
                UD--;
            } else if (moves.charAt(i) == 'L') {
                LR++;
            } else { // R
                LR--;
            }
        }
        return (UD == 0 && LR == 0);
    }
}