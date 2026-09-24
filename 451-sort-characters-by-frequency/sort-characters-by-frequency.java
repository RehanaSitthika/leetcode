class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        StringBuilder str=new StringBuilder();
        int max=0;
        for(int num:freq){
            max=Math.max(max,num);
        }
         for (int f = max; f >= 1; f--) {

            for (char c = 0; c < 128; c++) {

                if (freq[c] == f) {

                    for (int j = 0; j < f; j++) {
                        str.append(c);
                    }
                }
            }
        }
        return str.toString();
    }
}