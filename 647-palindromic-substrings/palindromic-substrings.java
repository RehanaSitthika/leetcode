class Solution {
    public int countSubstrings(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            String str = "";

            for (int j = i; j < s.length(); j++) {

                str += s.charAt(j);

                int r = str.length() - 1;
                int l = 0;

                boolean palindrome = true;

                while (l < r) {

                    if (str.charAt(r) != str.charAt(l)) {
                        palindrome = false;
                        break;
                    }

                    l++;
                    r--;
                }

                if (palindrome) {
                    c++;
                }
            }
        }

        return c;
    }
}
