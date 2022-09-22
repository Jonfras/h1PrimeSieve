package net.htlgkr.krejo.PrimeSieve;

public interface PrimeSieve {
    final int Max = 20;//(int)Math.sqrt(max)+2;
    boolean[] numbers = new boolean[Max];

    int[] primes = new int[Max+1];

    public static boolean isPrime(int p) {
        int counter = 1;
        primes[0] = 2;
        if (p % 2 == 0) return false;
        for (int prime = 3; prime + 2 < p; prime += 2) {
            if (!numbers[prime]) {
                primes[counter] = prime;
                counter++;
                for (int i = 2; prime * i < Max; i++) {
                    numbers[prime * i] = true;
                }
            }

        }
        if (!numbers[p]) return true;
        else return false;
    }
}
