import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

}
// Input 

// n = 3

// Output

//       0 
//     0 1 0 
//   0 1 2 1 0 
// 0 1 2 3 2 1 0 
//   0 1 2 1 0 
//     0 1 0 
//       0 