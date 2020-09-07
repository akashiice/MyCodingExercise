import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n*n; i++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            list.forEach(i -> System.out.print(i + " "));
            System.out.println();
        }
    }
}