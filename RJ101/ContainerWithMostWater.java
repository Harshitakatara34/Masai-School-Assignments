
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = 0;
            int cal = 1;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    cal = Math.min(arr[i], arr[j]) * (j - i);
                    if (cal > max) {
                        max = cal;
                    }
                }
            }

            System.out.println(max);
        }
    }
}

Sample Input
1
9
1 8 6 2 5 4 8 3 7

Sample Output
49

https://oj.masaischool.com/contest/9241/problem/101