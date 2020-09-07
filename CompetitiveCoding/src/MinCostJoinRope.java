import java.util.*;

/*
There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N where N is the number of ropes. The second line of each test case contains N input L[i],length of ropes.

Output:
For each testcase, print the minimum cost to connect all the ropes.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ L[i] ≤ 106

Example:
Input:
2
4
4 3 2 6
5
4 2 7 6 9

Output:
29
62
 */

class MinCostJoinRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long cost = 0;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                priorityQueue.add(sc.nextInt());
            }
            while (priorityQueue.size() >= 2) {
                int a = priorityQueue.poll();
                int b = priorityQueue.poll();
                cost = cost + a + b;
                priorityQueue.add(a+b);
            }
            System.out.println(cost);
        }
    }
}