class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4)); // 0,1,2,3 -> 2019
        int month = Integer.parseInt(date.substring(5,7)); // 5,6 -> 1 
        int day = Integer.parseInt(date.substring(8)); // 8,9 -> 9

        int days [] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 0 -> Jan, 1 -> Feb ......
        
        if (month > 2 && year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            day += 1;
        }

        month--; // becoz already day variable storing number of the current month

        while (month > 0) {
            day += (days[month-1]);
            month--;
        }

        return day;
    }
}
