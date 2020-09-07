import java.util.*;
/*
Given an input stream of N integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.

Input:
The first line of input contains an integer N denoting the number of elements in the stream. Then the next N lines contains integer x denoting the number to be inserted into the stream.
Output:
For each element added to the stream print the floor of the new median in a new line.

Constraints:
1 <= N <= 106
1 <= x <= 106

Example:
Input:
4
5
15
1
3
Output:
5
10
5
4
 */


class IntegerStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int median;
            list.add(sc.nextInt());
            Collections.sort(list);
            if (i % 2 == 0) {
                median = (list.get((i / 2)-1) + list.get((i / 2)))/2;
            } else {
                median = list.get((i / 2));
            }
            System.out.println(median);
        }
    }
}