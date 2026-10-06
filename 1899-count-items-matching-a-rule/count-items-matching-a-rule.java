class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int c = 0;

        if (ruleKey.equals("type")) {

            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(0))) {
                    c++;
                }
            }

        }
        else if (ruleKey.equals("color")) {

            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(1))) {
                    c++;
                }
            }

        }
        else {

            for (int i = 0; i < items.size(); i++) {
                if (ruleValue.equals(items.get(i).get(2))) {
                    c++;
                }
            }
        }

        return c;
    }
}