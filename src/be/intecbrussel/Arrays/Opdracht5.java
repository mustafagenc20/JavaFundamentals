package be.infernalwhale;

public class Opdracht5 {
    public static void main(String[] args) {
        int count = 0;
        int[] primes = new int[300];

        for (int numberToCheck = 0; numberToCheck < 1000; numberToCheck++) {
            if (numberToCheck == 0 || numberToCheck == 1) continue;
            boolean isPrime = true;

            for (int i = 2; i < numberToCheck; i++) {
                if (isPrime && numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = numberToCheck;
                count++;
            }
        }

        System.out.println("Number of found primes: " + count);

        for (int prime : primes) {
            if (prime != 0) System.out.println(prime);
        }
    }
}
