class Solution {
    // Function to find all possible paths
    
    private void helper(int row, int col, int m, int n, String str, ArrayList<String> ans, int maze[][], int dirs[][], char ch[]) {
        if (row < 0 || col < 0 || row >= m || col >= n || maze[row][col] == 0) {
            return;
        }
        
        if (row == m-1 && col == n-1) {
            ans.add(str);
            return;
        }
        
        maze[row][col] = 0;
        
        for(int i=0;i<4;i++) {
            int r = dirs[i][0];
            int c = dirs[i][1];
            char d = ch[i];
            
            helper(row + r, col + c, m, n, str + d, ans, maze, dirs, ch);
        }
        
        maze[row][col] = 1;
    }
    
    private void helper(int row, int col, int m, int n, String str, ArrayList<String> ans, int maze[][], String dir[][]) {
        if (row < 0 || col < 0 || row >= m || col >= n || maze[row][col] == 0) {
            return;
        }
        
        if (row == m-1 && col == n-1) {
            ans.add(str);
            return;
        }
        
        maze[row][col] = 0;
        
        for(int i=0;i<4;i++) {
            int r = Integer.parseInt(dir[i][0]);
            int c = Integer.parseInt(dir[i][1]);
            String d = dir[i][2];
            
            helper(row + r, col + c, m, n, str + d, ans, maze, dir);
        }
        
        maze[row][col] = 1;
    }
    
    
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        
        int dirs[][] = {{0,-1}, {0,1}, {-1,0}, {1,0}};
        char ch[] = {'L', 'R', 'U', 'D'};
        
        String dir[][] = {{"0","-1","L"}, {"0","1","R"}, {"-1","0","U"}, {"1","0","D"}};
        
        helper(0,0,n,n,"",ans,maze, dir);
        
        Collections.sort(ans); // For gettin the lexicographical order
        return ans;
    }
}
