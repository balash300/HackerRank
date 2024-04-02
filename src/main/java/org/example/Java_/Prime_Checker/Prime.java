package org.example.Java_.Prime_Checker;

class Prime {

    public boolean primeNum(int n) {
        if (n<=1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }

        return true;
    }

    public void checkPrime(Integer... p) {
        for (int i=0; i<p.length; i++) {
            if (primeNum(p[i])) {
                System.out.print(p[i] + " ");
            }
        }
        System.out.println();
    }
}
