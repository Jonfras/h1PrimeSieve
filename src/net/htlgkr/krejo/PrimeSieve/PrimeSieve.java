package net.htlgkr.krejo.PrimeSieve;

public interface PrimeSieve {
    final int Max = 20;//(int)Math.sqrt(max)+2;
    boolean[] numbers = new boolean[Max];

    int[] primes = new int[Max+1];

}
