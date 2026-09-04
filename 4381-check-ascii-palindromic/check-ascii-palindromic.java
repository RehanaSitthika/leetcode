class Solution {
    public boolean isPalindromic(String s) {

        int l = 0;
        int r = s.length() * 8 - 1;

        while (l < r) {

            int leftChar = l / 8;
            int leftBit = l % 8;

            int rightChar = r / 8;
            int rightBit = r % 8;

            int leftValue = (s.charAt(leftChar) >> (7 - leftBit)) & 1;
            int rightValue = (s.charAt(rightChar) >> (7 - rightBit)) & 1;

            if ((leftValue ^ rightValue) != 0) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}