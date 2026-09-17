class Solution {
    public List<Integer> getRow(int rowIndex) {
     
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <=rowIndex; i++) {

            List<Integer> row = new ArrayList<>();

            // First element
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                int value = list.get(i - 1).get(j - 1)
                           + list.get(i - 1).get(j);

                row.add(value);
            }

            // Last element
            if (i > 0) {
                row.add(1);
            }

            list.add(row);
        }

        return list.get(rowIndex);
    }
}