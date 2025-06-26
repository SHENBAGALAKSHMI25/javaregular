import java.util.*;
public class LeadersInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a[] = {16, 17, 4, 3, 5, 2};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                arr.add(a[i]);
            }
        }
        System.out.println(arr);
    }
}
