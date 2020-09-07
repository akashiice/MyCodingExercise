import java.util.*;

public class NElementsLeap {

    public static boolean canWin(int leap, int[] game, int start, int last) {
        // Return true if you can win the game; otherwise, return false.
        boolean result;
        if ((start+last == game.length-1 && game[start+last] == 0) || last > game.length-1) {
            result = true;
            return true;
        } else if (last < game.length-1 && game[start + 1] == 0) {
            result = canWin(leap, game, start + 1, last);
        } else {
            return false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0, leap)) ? "YES" : "NO");
        }
        scan.close();
    }
}