/*
https://leetcode.com/problems/judge-route-circle/description/
nitially, there is a Robot at position (0, 0). 
Given a sequence of its moves, judge if this robot makes a circle, 
which means it moves back to the original place.

The move sequence is represented by a string. 
And each move is represent by a character. 
The valid robot moves are R (Right), L (Left), U (Up) and D (down). 
The output should be true or false representing whether the robot makes a circle.
Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/
class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char currentMove;
        for (int i = 0; i < moves.length(); i++) {
            currentMove = moves.charAt(i);
            if (currentMove == 'R') {
                x++;
            } else if (currentMove == 'L') {
                x--;
            } else if (currentMove == 'U') {
                y++;
            } else if (currentMove == 'D') {
                y--;
            }
        }
        
        return (x == 0 && y == 0);
    }

    public static void main(String[] args) {
        JudgeCircle judgeCircle = new JudgeCircle();
        System.out.println(judgeCircle.judgeCircle("UD"));
    }
}