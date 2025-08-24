class Solution {
    public boolean validUtf8(int[] data) {
        int rb = 0;

        for(int ele : data) {
            if (rb == 0) { // Eligible for 4 conditions
                if ((ele>>7) == 0b0) {
                    rb = 0;
                } else if ((ele>>5) == 0b110) {
                    rb = 1;
                } else if ((ele>>4) == 0b1110) {
                    rb = 2;
                } else if ((ele>>3) == 0b11110) {
                    rb = 3; 
                } else {
                    return false;
                }
           } else {
                if ((ele>>6)== 0b10) {
                    rb-=1;
                } else {
                    return false;
                }
           }
        }

        return (rb != 0)? false :  true;
    } 
}
