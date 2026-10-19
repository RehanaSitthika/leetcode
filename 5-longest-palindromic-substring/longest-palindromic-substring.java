class Solution {
    public String longestPalindrome(String s) {

        String palin = "";

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int l = i;
            int r = i;

            while (l >= 0 && r < s.length()
                    && s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > palin.length()) {
                    palin = s.substring(l, r + 1);
                }

                l--;
                r++;
            }

            // Even length palindrome
            l = i;
            r = i + 1;

            while (l >= 0 && r < s.length()
                    && s.charAt(l) == s.charAt(r)) {

                if (r - l + 1 > palin.length()) {
                    palin = s.substring(l, r + 1);
                }

                l--;
                r++;
            }
        }

        return palin;
    }
}