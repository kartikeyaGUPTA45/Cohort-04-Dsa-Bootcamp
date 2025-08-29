public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;

        while(low <= high) {
            int mid =  low + (high-low)/2;
            int gValue = guess(mid);

            if (gValue == 0) {
                return mid;
            } else if (gValue == -1) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return -1;
    }
}
