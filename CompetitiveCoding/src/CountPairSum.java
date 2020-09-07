class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        if(x == 1.0) return 1;

        if(x > 0 && n == Integer.MIN_VALUE) return 0;
        if(x < 0 && n == Integer.MIN_VALUE) return 1;
        if(x > 0 && n == Integer.MAX_VALUE) return 0;
        if(x < 0 && n == Integer.MAX_VALUE) return -1;


        double res = 1;
        boolean powIsNegative = (n < 0) ;

        res = fastpow(x, n);

        // System.out.println(res);
        if(powIsNegative) return 1/res;

        return res;
    }

    private double fastpow(double x, int n){
        if(n == 0) return 1;

        double half = fastpow(x, n/2);

        if(n % 2 == 0){
            return half * half;
        }else{
            return half * half * x;
        }

    }

}