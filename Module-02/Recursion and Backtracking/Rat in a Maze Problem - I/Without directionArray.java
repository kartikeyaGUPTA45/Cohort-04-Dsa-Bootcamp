class Solution {
    // Function to find all possible paths
    
    private void helper(int row, int col, int m, int n, String str, ArrayList<String> ans, int maze[][]) {
        if (row < 0 || col < 0 || row >= m || col >= n || maze[row][col] == 0) {
            return;
        }
        
        if (row == m-1 && col == n-1) {
            ans.add(str);
            return;
        }
        
        maze[row][col] = 0;
        
        helper(row-1, col, m, n, str + "U", ans, maze);
        helper(row, col-1, m, n, str + "L", ans, maze);
        helper(row+1, col, m, n, str + "D", ans, maze);
        helper(row, col+1, m, n, str + "R", ans, maze);
        
        maze[row][col] = 1;
    }
    
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        helper(0,0,n,n,"",ans,maze);
        
        Collections.sort(ans); // For gettin the lexicographical order
        return ans;
    }
}
