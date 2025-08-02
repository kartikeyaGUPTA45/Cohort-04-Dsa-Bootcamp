class Solution {
    public boolean checkStraightLine(int[][] c) {
        int sz = c.length;

        if (sz == 1) {
            return false;
        }

        if (sz == 2) {
            return true;
        }

        int x0 = c[0][0], y0 = c[0][1];

        int dy = c[1][1] - y0;
        int dx = c[1][0] - x0;

        for(int i=1;i<sz;i++) {
            int x = c[i][0];
            int y = c[i][1];
            int ls = dy*(x-x0);
            int rs = dx*(y-y0);

            if (ls != rs) {
                return false;
            }
        }

        return true;
    }
}
