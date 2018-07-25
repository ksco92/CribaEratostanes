package CribaEratostenes;

import java.util.Arrays;

public class CribaEratostenes {

    public int [] generateCriba(int n) {
        int i, j;

        if (n >= 2) {
            boolean[] isPrime = createList(n);

            for (i = 2; i < isPrime.length; i++) {
                if (isPrime[i] && (Math.pow(i, 2) < n)) {
                    for (j = i + 1; j < isPrime.length; j++) {
                        if (j % i == 0) {
                            isPrime[j] = false;
                        }
                    }
                }
            }

            return getPrimes(isPrime);

        } else {
            return new int[0];
        }


    }

    private int [] getPrimes(boolean[] isPrime) {
        int i;
        int [] primes = new int[countPrimes(isPrime)];
        int nextPrimePosition = 0;

        for (i = 0; i < isPrime.length; i++){
            if (isPrime[i]) {
                primes[nextPrimePosition] = i;
                nextPrimePosition++;
            }
        }

        return primes;

    }

    private boolean [] createList(int n) {
        int dim = n + 1;
        boolean[] isPrime = new boolean[dim];

        Arrays.fill(isPrime, Boolean.TRUE);

        isPrime[0] = isPrime[1] = false;

        return isPrime;

    }

    private int countPrimes(boolean [] isPrime) {
        int count = 0;

        for (boolean b: isPrime) {
            if (b) {
                count++;
            }
        }

        return count;

    }
}
