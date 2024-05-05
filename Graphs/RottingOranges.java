package Graphs;

import java.util.LinkedList;
import java.util.Queue;


public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> pairQueue = new LinkedList<>();
        int row = grid.length, col = grid[0].length;

        // populate initial queue, 0th minute
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 2)
                    queue.offer(new Pair<>(i,j));
                else if(grid[i][j] == 1){

                }
            }
        }

    }
}

class Solution {


}

// idea is to maintian a queue with number of oranges rotting per minute
// updating that queue via BFS
