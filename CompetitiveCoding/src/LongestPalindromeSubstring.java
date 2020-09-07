
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(longestPalindrome("ukxidnpsdfwieixhjnannbmtppviyppjgbsludrzdleeiydzawnfmiiztsjqqqnthwinsqnrhfjxtklvbozkaeetmblqbxbugxycrlzizthtuwxlmgfjokhqjyukrftvfwikxlptydybmmzdhworzlaeztwsjyqnshggxdsjrzazphugckgykzhqkdrleaueuajjdpgagwtueoyybzanrvrgevolwssvqimgzpkxehnunycmlnetfaflhusauopyizbcpntywntadciopanyjoamoyexaxulzrktneytynmheigspgyhkelxgwplizyszcwdixzgxzgxiawstbnpjezxinyowmqsysazgwxpthloegxvezsxcvorzquzdtfcvckjpewowazuaynfpxsxrihsfswrmuvluwbdazmcealapulnahgdxxycizeqelesvshkgpavihywwlhdfopmmbwegibxhluantulnccqieyrbjjqtlgkpfezpxmlwpyohdyftzgbeoioquxpnrwrgzlhtlgyfwxtqcgkzcuuwagmlvgiwrhnredtulxudrmepbunyamssrfwyvgabbcfzzjayccvvwxzbfgeglqmuogqmhkjebehtwnmxotjwjszvrvpfpafwomlyqsgnysydfdlbbltlwugtapwgfnsiqxcnmdlrxoodkhaaaiioqglgeyuxqefdxbqbgbltrxcnihfwnzevvtkkvtejtecqyhqwjnnwfrzptzhdnmvsjnnsnixovnotugpzuymkjplctzqbfkdbeinvtgdpcbvzrmxdqthgorpaimpsaenmnyuyoqjqqrtcwiejutafyqmfauufwripmpcoknzyphratopyuadgsfrsrqkfwkdlvuzyepsiolpxkbijqw"));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static String longestPalindrome(String s) {
        String longestString;
        if(s.length()==0){
            longestString = "";
        }else{
            longestString = s.substring(0, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j+1);
                if (palindromeChecker(substring)) {
                    if (substring.length() > longestString.length()) {
                        longestString = substring;
                    }
                }
            }
        }
        return longestString;
    }

    public static boolean palindromeChecker(String s) {
        int middle = s.length() / 2;
        if (s.length()%2 == 0) {
            String reverse = new StringBuffer(s.substring(middle)).reverse().toString();
            return s.substring(0, middle).equalsIgnoreCase(reverse);
        } else {
            String reverse = new StringBuffer(s.substring(middle + 1)).reverse().toString();
            return s.substring(0, middle).equalsIgnoreCase(reverse);
        }
    }
}

