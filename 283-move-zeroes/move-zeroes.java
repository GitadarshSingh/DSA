class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;

        int i = 0; // "khali front jagah" ka pointer

        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++; // agli khali jagah ready
            }
            
        }
    }
}