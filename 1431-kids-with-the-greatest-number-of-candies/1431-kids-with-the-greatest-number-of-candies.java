class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {

        List<Boolean> n = new ArrayList<>();

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + extraCandies >= max) {
                n.add(true);
            } else {
                n.add(false);
            }
        }

        return n;
    }
}