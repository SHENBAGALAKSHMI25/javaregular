import java.util.Scanner;
public class indexsubarray {
    public static int[] subarray(int[] arr, int target) {
        int left = 0, sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("length of the array:"+n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        System.out.println("target:"+target);
        int[] result = subarray(arr, target);
        for (int num : result) {
            System.out.println(num + " ");
        }

    }
}


