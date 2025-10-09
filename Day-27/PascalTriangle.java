class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();

        // Base cases
        arr.add(new ArrayList<>());
        arr.get(0).add(1);

        if (numRows == 1) return arr;

        arr.add(new ArrayList<>());
        arr.get(1).add(1);
        arr.get(1).add(1);

        // Generate remaining rows
        for (int j = 3; j <= numRows; j++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = arr.get(j - 2); // previous row

            row.add(1); // first element

            for (int i = 1; i < j - 1; i++) {
                row.add(prev.get(i - 1) + prev.get(i)); // middle elements
            }

            row.add(1); // last element
            arr.add(row);
        }

        return arr;
    }
}