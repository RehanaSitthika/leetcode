import java.util.*;

class Solution {
    public String[] findWords(String[] words) {

        String w[] = new String[words.length];
        int j = 0;

        char r1[] = {'q','w','e','r','t','y','u','i','o','p'};
        char r2[] = {'a','s','d','f','g','h','j','k','l'};
        char r3[] = {'z','x','c','v','b','n','m'};

        HashSet<Character> ch = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            String str = words[i].toLowerCase();

            ch.clear();

            for (char chr : str.toCharArray()) {
                ch.add(chr);
            }

            // Row 1
            HashSet<Character> temp = new HashSet<>();

            for (char chr : ch) {
                for (int k = 0; k < r1.length; k++) {
                    if (chr == r1[k]) {
                        temp.add(chr);
                    }
                }
            }

            if (temp.size() == ch.size()) {
                w[j++] = words[i];
                continue;
            }

            // Row 2
            temp.clear();

            for (char chr : ch) {
                for (int k = 0; k < r2.length; k++) {
                    if (chr == r2[k]) {
                        temp.add(chr);
                    }
                }
            }

            if (temp.size() == ch.size()) {
                w[j++] = words[i];
                continue;
            }

            // Row 3
            temp.clear();

            for (char chr : ch) {
                for (int k = 0; k < r3.length; k++) {
                    if (chr == r3[k]) {
                        temp.add(chr);
                    }
                }
            }

            if (temp.size() == ch.size()) {
                w[j++] = words[i];
            }
        }

        return Arrays.copyOf(w, j);
    }
}