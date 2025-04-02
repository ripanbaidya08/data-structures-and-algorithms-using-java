package io.dsalgo.math;

class Pow {
    public double myPow(double x, int y) { // pow(x, y)
        double ans = 1.0;
        long n = Math.abs((long)y);

        while(n > 0){
            if(n%2 == 1){
                ans *= x;
            }
            x *= x;
            n /= 2; 
        }
        return y < 0 ? 1/ans : ans;
    }
}