class Solution {
    public int thirdMax(int[] nums) {
        Integer firstMax = null, secondMax = null, thirdMax = null;

        for(Integer ele : nums) {
            if (ele.equals(firstMax) || ele.equals(secondMax) || ele.equals(thirdMax)) {
                continue;
            }

            if (firstMax == null || firstMax < ele) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = ele;
            } else if (secondMax == null || secondMax < ele) {
                thirdMax = secondMax;
                secondMax = ele;
            } else if (thirdMax == null || thirdMax < ele) {
                thirdMax = ele;
            }
        }

        return (thirdMax == null) ? firstMax : thirdMax;

    }
}
