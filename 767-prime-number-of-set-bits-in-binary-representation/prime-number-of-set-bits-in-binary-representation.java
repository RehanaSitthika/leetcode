class Solution {
    public int countPrimeSetBits(int left, int right) {

        int p = 0;

        for (int i = left; i <= right; i++) {

            int n = i;
            int c = 0;

            while (n > 0) {

                if (n % 2 == 1) {
                    c++;
                }

                n = n / 2;
            }

            if (isprime(c)) {
                p++;
            }
        }

        return p;
    }

    public static boolean isprime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}