class Solution {
    private int convertToDays(String s) {
        int days [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int mm = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3));
        mm-=1;
        while(mm > 0) {
            day += days[mm-1];
            mm-=1;
        }

        return day;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int x = convertToDays(arriveAlice);
        int y = convertToDays(leaveAlice);

        int z = convertToDays(arriveBob);
        int w = convertToDays(leaveBob);

        int X = Math.max(x,z);
        int Y = Math.min(y,w);

        if (Y-X < 0) return 0;

        return Y-X+1;
    }
}
