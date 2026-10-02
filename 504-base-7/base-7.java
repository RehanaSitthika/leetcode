class Solution {
    public String convertToBase7(int num) {

        if (num == 0) {
            return "0";
        }

        long n = num;
        String str = "";

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            long rem = n % 7;
            str = rem + str;
            n = n / 7;
        }

        if (num < 0) {
            str = "-" + str;
        }

        return str;
    }
}