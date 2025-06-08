public class Rearrangearray {
    public static void main(String[] args) {
        int nums[] = {3, 1, -2, -5, 2, -4}; // fixed array

        int n = nums.length;
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int posCount = 0, negCount = 0;

        // Separate positive and negative numbers compactly
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                positives[posCount++] = nums[i];
            } else {
                negatives[negCount++] = nums[i];
            }
        }

        // Rearrange alternating positive and negative
        int i = 0, p = 0, q = 0;
        while (p < posCount && q < negCount) {
            nums[i++] = positives[p++];
            nums[i++] = negatives[q++];
        }

        // If leftover positives
        while (p < posCount) {
            nums[i++] = positives[p++];
        }

        // If leftover negatives
        while (q < negCount) {
            nums[i++] = negatives[q++];
        }

        // Print rearranged array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
